package vampirefsm.models

import play.api.libs.json.Json

case class VampirecheckerFrontendModel(parameter1: String,
                                       parameter2: Option[String],
                                       telephoneNumber: Option[String],
                                       emailAddress: Option[String])

object VampirecheckerFrontendModel {
  implicit val modelFormat = Json.format[VampirecheckerFrontendModel]
}
