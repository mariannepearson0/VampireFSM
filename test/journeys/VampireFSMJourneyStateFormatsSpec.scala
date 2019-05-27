package journeys

import play.api.libs.json.{Format, Json}
import uk.gov.hmrc.play.test.UnitSpec
import vampirefsm.journeys.VampireFSMJourneyModel.State
import vampirefsm.journeys.VampireFSMJourneyModel.State._
import vampirefsm.journeys.VampireFSMJourneyStateFormats

class VampireFSMJourneyStateFormatsSpec extends UnitSpec {

  implicit val formats: Format[State] = VampireFSMJourneyStateFormats.formats

  "VampireFSMJourneyStateFormats" should {
    "serialize and deserialize state" when {
      "Start" in {
        val state = Start
        val json = Json.parse("""{"state":"Start"}""")

        Json.toJson(state) shouldBe json
        json.as[State] shouldBe state
      }
      "Age" in {
        val state = Age
        val json = Json.parse("""{"state":"Age"}""")

        Json.toJson(state) shouldBe json
        json.as[State] shouldBe state
      }
      "BiteMarks" in {
        val state = BiteMarks(3)
        val json = Json.parse("""{"state":"BiteMarks", "properties": {"ageRange": 3}}""")

        Json.toJson(state) shouldBe json
        json.as[State] shouldBe state
      }
      "Sun" in {
        val state = Sun(3, true)
        val json = Json.parse("""{"state":"Sun", "properties": {"ageRange": 3, "hasBiteMarks": true}}""")

        Json.toJson(state) shouldBe json
        json.as[State] shouldBe state
      }
      "End" in {
        val state = End("definitely")
        val json = Json.parse("""{"state":"End", "properties": {"result": "definitely"}}""")

        Json.toJson(state) shouldBe json
        json.as[State] shouldBe state
      }
    }
  }
}
