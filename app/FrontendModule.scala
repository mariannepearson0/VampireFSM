import java.net.URL

import com.google.inject.AbstractModule
import com.google.inject.name.Names
import javax.inject.Provider
import play.api.{Configuration, Environment, Logger}
import uk.gov.hmrc.auth.core.AuthConnector
import uk.gov.hmrc.http._
import uk.gov.hmrc.play.bootstrap.http.DefaultHttpClient
import uk.gov.hmrc.play.config.ServicesConfig
import vampirefsm.connectors.FrontendAuthConnector

class FrontendModule(val environment: Environment,
                     val configuration: Configuration)
    extends AbstractModule
    with ServicesConfig {

  override val runModeConfiguration: Configuration = configuration
  override protected def mode = environment.mode

  def configure(): Unit = {
    val appName = "vampirefsm"

    Logger(getClass).info(
      s"Starting microservice : $appName : in mode : ${environment.mode}")

    bindProperty("appName")

    bind(classOf[HttpGet]).to(classOf[DefaultHttpClient])
    bind(classOf[HttpPost]).to(classOf[DefaultHttpClient])
    bind(classOf[AuthConnector]).to(classOf[FrontendAuthConnector])

    bindIntegerProperty("mongodb.session.expireAfterSeconds")

    bindBaseUrl("auth")
  }

  private def bindBaseUrl(serviceName: String) =
    bind(classOf[URL])
      .annotatedWith(Names.named(s"$serviceName-baseUrl"))
      .toProvider(new BaseUrlProvider(serviceName))

  private class BaseUrlProvider(serviceName: String) extends Provider[URL] {
    override lazy val get = new URL(baseUrl(serviceName))
  }

  private def bindProperty(propertyName: String) =
    bind(classOf[String])
      .annotatedWith(Names.named(propertyName))
      .toProvider(new PropertyProvider(propertyName))

  private class PropertyProvider(confKey: String) extends Provider[String] {
    override lazy val get = configuration
      .getString(confKey)
      .getOrElse(
        throw new IllegalStateException(
          s"No value found for configuration property $confKey"))
  }

  private def bindIntegerProperty(propertyName: String) =
    bind(classOf[Int])
      .annotatedWith(Names.named(propertyName))
      .toProvider(new IntegerPropertyProvider(propertyName))

  private class IntegerPropertyProvider(confKey: String) extends Provider[Int] {
    override lazy val get: Int = configuration
      .getInt(confKey)
      .getOrElse(
        throw new IllegalStateException(
          s"No value found for configuration property $confKey"))
  }

  import com.google.inject.binder.ScopedBindingBuilder
  import com.google.inject.name.Names.named

  import scala.reflect.ClassTag

  private def bindServiceConfigProperty[A](propertyName: String)(
      implicit classTag: ClassTag[A],
      ct: ServiceConfigPropertyType[A]): ScopedBindingBuilder =
    ct.bindServiceConfigProperty(classTag.runtimeClass.asInstanceOf[Class[A]])(
      propertyName)

  sealed trait ServiceConfigPropertyType[A] {
    def bindServiceConfigProperty(clazz: Class[A])(
        propertyName: String): ScopedBindingBuilder
  }

  object ServiceConfigPropertyType {

    implicit val stringServiceConfigProperty
      : ServiceConfigPropertyType[String] =
      new ServiceConfigPropertyType[String] {
        def bindServiceConfigProperty(clazz: Class[String])(
            propertyName: String): ScopedBindingBuilder =
          bind(clazz)
            .annotatedWith(named(s"$propertyName"))
            .toProvider(new StringServiceConfigPropertyProvider(propertyName))

        private class StringServiceConfigPropertyProvider(propertyName: String)
            extends Provider[String] {
          override lazy val get = getConfString(
            propertyName,
            throw new RuntimeException(
              s"No service configuration value found for '$propertyName'"))
        }
      }

    implicit val intServiceConfigProperty: ServiceConfigPropertyType[Int] =
      new ServiceConfigPropertyType[Int] {
        def bindServiceConfigProperty(clazz: Class[Int])(
            propertyName: String): ScopedBindingBuilder =
          bind(clazz)
            .annotatedWith(named(s"$propertyName"))
            .toProvider(new IntServiceConfigPropertyProvider(propertyName))

        private class IntServiceConfigPropertyProvider(propertyName: String)
            extends Provider[Int] {
          override lazy val get = getConfInt(
            propertyName,
            throw new RuntimeException(
              s"No service configuration value found for '$propertyName'"))
        }
      }

    implicit val booleanServiceConfigProperty
      : ServiceConfigPropertyType[Boolean] =
      new ServiceConfigPropertyType[Boolean] {
        def bindServiceConfigProperty(clazz: Class[Boolean])(
            propertyName: String): ScopedBindingBuilder =
          bind(clazz)
            .annotatedWith(named(s"$propertyName"))
            .toProvider(new BooleanServiceConfigPropertyProvider(propertyName))

        private class BooleanServiceConfigPropertyProvider(propertyName: String)
            extends Provider[Boolean] {
          override lazy val get = getConfBool(propertyName, false)
        }
      }
  }

}
