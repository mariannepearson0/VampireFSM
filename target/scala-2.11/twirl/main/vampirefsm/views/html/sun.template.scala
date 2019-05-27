
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sun_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object sun_Scope1 {
import vampirefsm.controllers.routes.VampireFSMController
import play.api.Configuration
import uk.gov.hmrc.play.views.html.helpers.{errorSummary, form, input_radio_group}

class sun extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[String],Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(sunForm: Form[String])(implicit request: Request[_], messages: Messages, config: Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.98*/("""

"""),_display_(/*7.2*/vampirefsm/*7.12*/.views.html.main_template(title = Messages("start.title"), bodyClasses = None)/*7.90*/ {_display_(Seq[Any](format.raw/*7.92*/("""

    """),format.raw/*9.5*/("""<h1 class="heading-xlarge">How sensitive are you to the sun?</h1>

    """),_display_(/*11.6*/form(action = VampireFSMController.submitSun,
        'class -> "form js-form")/*12.34*/ {_display_(Seq[Any](format.raw/*12.36*/("""

        """),_display_(/*14.10*/input_radio_group(
            sunForm("sun"),
            Seq(("tan", "Low - I tan easily"),("mid", "Medium - I'm partial to sunburn"), ("fire", "High - I burst into flames")),
            '_groupDivClass -> "form-group soft--ends margin-bottom-10",
            '_fieldsetAttributes -> Html("""id='clientType'""")
        )),format.raw/*19.10*/("""

        """),format.raw/*21.9*/("""<button class="button form-field--submit margin-top-20" type="submit" id="continue">Continue</button>
    """)))}),format.raw/*22.6*/("""

""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(sunForm:Form[String],request:Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},messages:Messages,config:Configuration): play.twirl.api.HtmlFormat.Appendable = apply(sunForm)(request,messages,config)

  def f:((Form[String]) => (Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration) => play.twirl.api.HtmlFormat.Appendable) = (sunForm) => (request,messages,config) => apply(sunForm)(request,messages,config)

  def ref: this.type = this

}


}
}

/**/
object sun extends sun_Scope0.sun_Scope1.sun
              /*
                  -- GENERATED --
                  DATE: Mon May 27 12:28:43 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/sun.scala.html
                  HASH: 968ef57ac38c3658034825994346ba43a3a1038d
                  MATRIX: 842->176|1033->272|1061->275|1079->285|1165->363|1204->365|1236->371|1334->443|1422->522|1462->524|1500->535|1845->859|1882->869|2019->976|2052->979
                  LINES: 27->5|32->5|34->7|34->7|34->7|34->7|36->9|38->11|39->12|39->12|41->14|46->19|48->21|49->22|51->24
                  -- GENERATED --
              */
          