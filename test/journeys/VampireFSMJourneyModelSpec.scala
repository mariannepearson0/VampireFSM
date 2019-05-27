package journeys

import uk.gov.hmrc.agentmtdidentifiers.model.Arn
import uk.gov.hmrc.http.HeaderCarrier
import uk.gov.hmrc.play.test.UnitSpec
import vampirefsm.journeys.VampireFSMJourneyModel.State
import vampirefsm.journeys.VampireFSMJourneyModel.State._
import vampirefsm.journeys.VampireFSMJourneyModel.Transition
import vampirefsm.journeys.VampireFSMJourneyModel.Transitions._

import scala.concurrent.ExecutionContext.Implicits.global

class VampireFSMJourneyModelSpec extends UnitSpec with StateMatchers[State] {

  implicit val hc: HeaderCarrier = HeaderCarrier()

  val arn: Arn = Arn("TARN0000001")

  case class given(initialState: State) extends VampireFSMJourneyService with TestStorage[(State, List[State])] {
    await(save((initialState, Nil)))

    def when(transition: Transition): (State, List[State]) =
      await(super.apply(transition))
  }

  "VampireFSMJourneyModelSpec" when {
    "at state Start" should {
      "transition to Age" in {
        given(Start) when started(arn) should thenGo(Age)
      }
    }
    "at state Age" should {
      "transition to BiteMarks" in {
        given(Age) when selectedAge(arn)(2) should thenGo(BiteMarks(2))
      }
    }
    "at state BiteMarks" should {
      "transition to Sun" in {
        given(BiteMarks(2)) when selectedBiteMarks(arn)(true) should thenGo(Sun(2, true))
      }
    }
    "at state Sun" should {
      "transition to End when they are definitely a vampire" in {
        given(Sun(4, true)) when selectedSun(arn)("fire") should thenGo(End("definitely"))
      }
      "transition to End when they are definitely not a vampire" in {
        given(Sun(1, false)) when selectedSun(arn)("tan") should thenGo(End("definitelyNot"))
      }
      "transition to End when they might be a vampire" in {
        given(Sun(2, false)) when selectedSun(arn)("fire") should thenGo(End("maybe"))
      }
    }
  }
}
