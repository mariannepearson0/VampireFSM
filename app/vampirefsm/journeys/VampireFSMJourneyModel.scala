package vampirefsm.journeys

import uk.gov.hmrc.agentmtdidentifiers.model.Arn
import uk.gov.hmrc.play.fsm.JourneyModel

object VampireFSMJourneyModel extends JourneyModel {

  sealed trait State

  val root: State = State.Start

  object State {
    case object Start extends State
    case object Age extends State
    case class BiteMarks(paleLevel: Int) extends State
    case class Sun(paleLevel: Int, hasBiteMarks: Boolean) extends State
    case class End(result: String) extends State
  }

  object Transitions {

    import State._

    def started(arn: Arn) = Transition {
      case Start => goto(Age)
    }

    def selectedAge(arn: Arn)(ageRange: Int) = Transition {
      case Age => goto(BiteMarks(ageRange))
    }

    def selectedBiteMarks(arn: Arn)(hasBiteMarks: Boolean) = Transition {
      case BiteMarks(paleLevel) => goto(Sun(paleLevel, hasBiteMarks))
    }

    def selectedSun(arn: Arn)(reactionToSun: String) = Transition {
      case Sun(paleLevel, hasBiteMarks) =>
        if (paleLevel > 2 && hasBiteMarks && reactionToSun == "fire")
          goto(End("definitely"))
        else if (paleLevel < 3 && !hasBiteMarks && reactionToSun == "tan")
          goto(End("definitelyNot"))
        else goto(End("maybe"))
    }
  }
}
