
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mariannepearson/Documents/VampireFSM/conf/prod.routes
// @DATE:Mon May 27 11:01:14 BST 2019

package prod

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  app_Routes_2: app.Routes,
  // @LINE:3
  health_Routes_0: health.Routes,
  // @LINE:4
  template_Routes_1: template.Routes,
  // @LINE:6
  MetricsController_0: javax.inject.Provider[com.kenshoo.play.metrics.MetricsController],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    app_Routes_2: app.Routes,
    // @LINE:3
    health_Routes_0: health.Routes,
    // @LINE:4
    template_Routes_1: template.Routes,
    // @LINE:6
    MetricsController_0: javax.inject.Provider[com.kenshoo.play.metrics.MetricsController]
  ) = this(errorHandler, app_Routes_2, health_Routes_0, template_Routes_1, MetricsController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    prod.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, app_Routes_2, health_Routes_0, template_Routes_1, MetricsController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_app_Routes_2_0.router.documentation,
    prefixed_health_Routes_0_1.router.documentation,
    prefixed_template_Routes_1_2.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/metrics""", """@com.kenshoo.play.metrics.MetricsController@.metrics"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] val prefixed_app_Routes_2_0 = Include(app_Routes_2.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "vampirechecker"))

  // @LINE:3
  private[this] val prefixed_health_Routes_0_1 = Include(health_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + ""))

  // @LINE:4
  private[this] val prefixed_template_Routes_1_2 = Include(template_Routes_1.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "template"))

  // @LINE:6
  private[this] lazy val com_kenshoo_play_metrics_MetricsController_metrics3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/metrics")))
  )
  private[this] lazy val com_kenshoo_play_metrics_MetricsController_metrics3_invoker = createInvoker(
    MetricsController_0.get.metrics,
    HandlerDef(this.getClass.getClassLoader,
      "prod",
      "com.kenshoo.play.metrics.MetricsController",
      "metrics",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/metrics"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case prefixed_app_Routes_2_0(handler) => handler
  
    // @LINE:3
    case prefixed_health_Routes_0_1(handler) => handler
  
    // @LINE:4
    case prefixed_template_Routes_1_2(handler) => handler
  
    // @LINE:6
    case com_kenshoo_play_metrics_MetricsController_metrics3_route(params) =>
      call { 
        com_kenshoo_play_metrics_MetricsController_metrics3_invoker.call(MetricsController_0.get.metrics)
      }
  }
}
