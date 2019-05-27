
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

"""),_display_(/*7.2*/vampirefsm/*7.12*/.views.html.main_template(title = "How sensitive are you to the sun?", bodyClasses = None)/*7.102*/ {_display_(Seq[Any](format.raw/*7.104*/("""

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
                  DATE: Mon May 27 13:23:52 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/sun.scala.html
                  HASH: a05ec9e954605344b9bd7b8cf7f6ee5ae689d04e
                  MATRIX: 842->176|1033->272|1061->275|1079->285|1178->375|1218->377|1250->383|1348->455|1436->534|1476->536|1514->547|1859->871|1896->881|2033->988|2066->991
                  LINES: 27->5|32->5|34->7|34->7|34->7|34->7|36->9|38->11|39->12|39->12|41->14|46->19|48->21|49->22|51->24
                  -- GENERATED --
              */
          