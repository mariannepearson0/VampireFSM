package vampirefsm.connectors

import java.net.URL
import javax.inject.{Inject, Named, Singleton}

import com.codahale.metrics.MetricRegistry
import com.kenshoo.play.metrics.Metrics
import uk.gov.hmrc.agent.kenshoo.monitoring.HttpAPIMonitor
import vampirefsm.models.VampirecheckerFrontendModel

import scala.concurrent.{ExecutionContext, Future}
import uk.gov.hmrc.http.{HeaderCarrier, HttpGet, HttpPost, HttpResponse}

@Singleton
class VampirecheckerConnector @Inject()(
    @Named("vampirechecker-baseUrl") baseUrl: URL,
    http: HttpGet with HttpPost,
    metrics: Metrics)
    extends HttpAPIMonitor {

  override val kenshooRegistry: MetricRegistry = metrics.defaultRegistry

  def getSmth()(implicit hc: HeaderCarrier,
                ec: ExecutionContext): Future[HttpResponse] = {
    monitor(s"ConsumedAPI-vampirechecker-smth-GET") {
      http.GET[HttpResponse](
        new URL(baseUrl, "/vampirechecker/dosmth").toExternalForm)
    }
  }

  def postSmth(model: VampirecheckerFrontendModel)(
      implicit hc: HeaderCarrier,
      ec: ExecutionContext): Future[HttpResponse] = {
    monitor(s"ConsumedAPI-vampirechecker-smth-POST") {
      http.POST[VampirecheckerFrontendModel, HttpResponse](
        new URL(baseUrl, "/vampirechecker/dosmth").toExternalForm,
        model)
    }
  }

}
