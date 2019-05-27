
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object bite_marks_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object bite_marks_Scope1 {
import vampirefsm.controllers.routes.VampireFSMController
import play.api.Configuration
import uk.gov.hmrc.play.views.html.helpers.{errorSummary, form, input_radio_group}

class bite_marks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Boolean],Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(biteMarksForm: Form[Boolean])(implicit request: Request[_], messages: Messages, config: Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.105*/("""

"""),_display_(/*8.2*/vampirefsm/*8.12*/.views.html.main_template(title = Messages("start.title"), bodyClasses = None)/*8.90*/ {_display_(Seq[Any](format.raw/*8.92*/("""

    """),format.raw/*10.5*/("""<h1 class="heading-xlarge">Do you have any noticeable bite marks?</h1>

    """),_display_(/*12.6*/form(VampireFSMController.submitBiteMarks)/*12.48*/{_display_(Seq[Any](format.raw/*12.49*/("""

        """),_display_(/*14.10*/input_radio_group(
            biteMarksForm("accepted"),
            Seq(("true", "Yes - and they won't stop bleeding"),("false", "No - of course not")),
            '_legendClass -> "form-label",
            '_groupDivClass -> "form-group soft--ends",
            '_fieldsetAttributes -> Html("""id='accepted'""")
        )),format.raw/*20.10*/("""

        """),format.raw/*22.9*/("""<div class="form-group">
            <button class="button" type="submit" id="continue">Continue</button>
        </div>
    """)))}),format.raw/*25.6*/("""


""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(biteMarksForm:Form[Boolean],request:Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},messages:Messages,config:Configuration): play.twirl.api.HtmlFormat.Appendable = apply(biteMarksForm)(request,messages,config)

  def f:((Form[Boolean]) => (Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration) => play.twirl.api.HtmlFormat.Appendable) = (biteMarksForm) => (request,messages,config) => apply(biteMarksForm)(request,messages,config)

  def ref: this.type = this

}


}
}

/**/
object bite_marks extends bite_marks_Scope0.bite_marks_Scope1.bite_marks
              /*
                  -- GENERATED --
                  DATE: Mon May 27 12:24:10 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/bite_marks.scala.html
                  HASH: 8580c17d5e688a377f4b1653311344eec3c93b95
                  MATRIX: 864->177|1063->280|1091->283|1109->293|1195->371|1234->373|1267->379|1370->456|1421->498|1460->499|1498->510|1844->835|1881->845|2037->971|2071->975
                  LINES: 27->6|32->6|34->8|34->8|34->8|34->8|36->10|38->12|38->12|38->12|40->14|46->20|48->22|51->25|54->28
                  -- GENERATED --
              */
          