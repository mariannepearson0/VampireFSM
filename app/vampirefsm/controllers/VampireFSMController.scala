package vampirefsm.controllers

import javax.inject.{Inject, Singleton}
import journeys.VampireFSMJourneyService
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.{Constraint, Invalid, Valid, ValidationError}
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import play.api.{Configuration, Environment}
import uk.gov.hmrc.agentmtdidentifiers.model.Arn
import uk.gov.hmrc.http.HeaderCarrier
import uk.gov.hmrc.play.bootstrap.controller.FrontendController
import uk.gov.hmrc.play.fsm.JourneyController
import vampirefsm.connectors.FrontendAuthConnector
import vampirefsm.journeys.VampireFSMJourneyModel.State._
import vampirefsm.journeys.VampireFSMJourneyModel.Transitions._
import vampirefsm.views.html

import scala.concurrent.ExecutionContext

@Singleton
class VampireFSMController @Inject()(
    override val messagesApi: MessagesApi,
    val journeyService: VampireFSMJourneyService,
    val authConnector: FrontendAuthConnector,
    val env: Environment)(implicit val configuration: Configuration,
                          ec: ExecutionContext)
    extends FrontendController
    with JourneyController[HeaderCarrier]
    with I18nSupport
    with AuthActions {

  override def context(implicit rh: RequestHeader): HeaderCarrier = hc

  import VampireFSMController._

  val AsAgent: WithAuthorised[Arn] = { implicit request: Request[Any] =>
    withAuthorisedAsAgent(_)
  }

  def root: Action[AnyContent] =
    Action(Redirect(routes.VampireFSMController.start()))

  def start: Action[AnyContent] = actionShowStateWhenAuthorised(AsAgent) {
    case Start =>
  }

  def submitStart: Action[AnyContent] = action { implicit request =>
    whenAuthorised(AsAgent)(started)(redirect)
  }

  def showAge = actionShowStateWhenAuthorised(AsAgent) {
    case Age =>
  }

  def submitAge: Action[AnyContent] = action { implicit request =>
    whenAuthorisedWithForm(AsAgent)(ageForm)(selectedAge)
  }

  def showBiteMarks: Action[AnyContent] =
    actionShowStateWhenAuthorised(AsAgent) {
      case _: BiteMarks =>
    }

  def submitBiteMarks: Action[AnyContent] = action { implicit request =>
    whenAuthorisedWithForm(AsAgent)(biteMarksForm)(selectedBiteMarks)
  }

  def showSun: Action[AnyContent] = actionShowStateWhenAuthorised(AsAgent) {
    case _: Sun =>
  }

  def submitSun: Action[AnyContent] = action { implicit request =>
    whenAuthorisedWithForm(AsAgent)(sunForm)(selectedSun)
  }

  def showEnd: Action[AnyContent] = actionShowStateWhenAuthorised(AsAgent) {
    case _: End =>
  }

  override def getCallFor(state: journeyService.model.State)(
      implicit request: Request[_]): Call = state match {
    case Start        => routes.VampireFSMController.start()
    case Age          => routes.VampireFSMController.showAge()
    case _: BiteMarks => routes.VampireFSMController.showBiteMarks()
    case _: Sun       => routes.VampireFSMController.showSun()
    case _: End       => routes.VampireFSMController.showEnd()
  }

  override def renderState(
      state: journeyService.model.State,
      breadcrumbs: journeyService.Breadcrumbs,
      formWithErrors: Option[Form[_]])(implicit request: Request[_]): Result =
    state match {
      case Start           => Ok(html.start())
      case Age             => Ok(html.age(ageForm))
      case _: BiteMarks    => Ok(html.bite_marks(biteMarksForm))
      case _: Sun          => Ok(html.sun(sunForm))
      case End(likelihood) => Ok(html.end(likelihood))
    }

}

object VampireFSMController {

  import play.api.data.Form

  def confirmationChoice(errorMessage: String): Constraint[String] =
    Constraint[String] { fieldValue: String =>
      if (fieldValue.trim.nonEmpty) Valid
      else Invalid(ValidationError(errorMessage))
    }

  def ageForm: Form[Int] =
    Form(
      mapping(
        "age" -> optional(text)
          .transform[String](_.getOrElse(""), s => Some(s))
          .verifying(confirmationChoice("nothing selected"))
      )(choice => choice.toInt)(confirmation => Some(confirmation.toString)))

  def biteMarksForm: Form[Boolean] =
    Form(
      mapping(
        "accepted" -> optional(text)
          .transform[String](_.getOrElse(""), s => Some(s))
          .verifying(confirmationChoice("no choice"))
      )(choice => choice.toBoolean)(confirmation =>
        Some(confirmation.toString)))

  def sunForm: Form[String] =
    Form(
      mapping(
        "sun" -> optional(text)
          .transform[String](_.getOrElse(""), s => Some(s))
          .verifying(confirmationChoice("no choice"))
      )(choice => choice)(confirmation => Some(confirmation.toString)))
}
