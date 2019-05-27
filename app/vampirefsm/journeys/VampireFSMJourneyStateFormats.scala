package vampirefsm.journeys

import play.api.libs.json._
import uk.gov.hmrc.play.fsm.JsonStateFormats
import vampirefsm.journeys.VampireFSMJourneyModel.State
import vampirefsm.journeys.VampireFSMJourneyModel.State._

object VampireFSMJourneyStateFormats extends JsonStateFormats[State] {

  //Happy states
  val BiteMarksFormat = Json.format[BiteMarks]
  val SunFormat = Json.format[Sun]
  val EndFormat = Json.format[End]

  override val serializeStateProperties: PartialFunction[State, JsValue] = {
    case s: BiteMarks => BiteMarksFormat.writes(s)
    case s: Sun       => SunFormat.writes(s)
    case s: End       => EndFormat.writes(s)
  }

  override def deserializeState(stateName: String,
                                properties: JsValue): JsResult[State] =
    stateName match {
      case "Start"     => JsSuccess(Start)
      case "Age"       => JsSuccess(Age)
      case "BiteMarks" => BiteMarksFormat.reads(properties)
      case "Sun"       => SunFormat.reads(properties)
      case "End"       => EndFormat.reads(properties)
      case _           => JsError(s"Unknown state name $stateName")
    }

}
