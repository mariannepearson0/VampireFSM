
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object age_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object age_Scope1 {
import vampirefsm.controllers.routes.VampireFSMController
import play.api.Configuration
import uk.gov.hmrc.play.views.html.helpers.{errorSummary, form, input_radio_group}

class age extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Int],Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(ageForm : Form[Int])(implicit request: Request[_], messages: Messages, config: Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.96*/("""

"""),_display_(/*7.2*/vampirefsm/*7.12*/.views.html.main_template(title = "How old are you?", bodyClasses = None)/*7.85*/ {_display_(Seq[Any](format.raw/*7.87*/("""

    """),format.raw/*9.5*/("""<h1 class="heading-xlarge">How old are you?</h1>

    """),_display_(/*11.6*/form(action = VampireFSMController.submitAge,
        'class -> "form js-form")/*12.34*/ {_display_(Seq[Any](format.raw/*12.36*/("""

        """),_display_(/*14.10*/input_radio_group(
            ageForm("age"),
            Seq(("1", "Under 100"),("2", "100 to 200"), ("3", "over 200"), ("5", "I've lost count")),
            '_groupDivClass -> "form-group soft--ends margin-bottom-10",
            '_fieldsetAttributes -> Html("""id='clientType'""")
        )),format.raw/*19.10*/("""

        """),format.raw/*21.9*/("""<button class="button form-field--submit margin-top-20" type="submit" id="continue">Continue</button>
    """)))}),format.raw/*22.6*/("""
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(ageForm:Form[Int],request:Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},messages:Messages,config:Configuration): play.twirl.api.HtmlFormat.Appendable = apply(ageForm)(request,messages,config)

  def f:((Form[Int]) => (Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration) => play.twirl.api.HtmlFormat.Appendable) = (ageForm) => (request,messages,config) => apply(ageForm)(request,messages,config)

  def ref: this.type = this

}


}
}

/**/
object age extends age_Scope0.age_Scope1.age
              /*
                  -- GENERATED --
                  DATE: Mon May 27 13:23:52 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/age.scala.html
                  HASH: 99d3b70234f30e13e48c78363cc7dfdf5da0d7f5
                  MATRIX: 839->176|1028->270|1056->273|1074->283|1155->356|1194->358|1226->364|1307->419|1395->498|1435->500|1473->511|1789->806|1826->816|1963->923|1995->925
                  LINES: 27->5|32->5|34->7|34->7|34->7|34->7|36->9|38->11|39->12|39->12|41->14|46->19|48->21|49->22|50->23
                  -- GENERATED --
              */
          