
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object start_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object start_Scope1 {
import vampirefsm.controllers.routes.VampireFSMController
import play.api.Configuration
import uk.gov.hmrc.play.views.html.helpers.{errorSummary, form, input_radio_group}

class start extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/()(implicit request: Request[_], messages: Messages, config: Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.77*/("""

"""),_display_(/*7.2*/vampirefsm/*7.12*/.views.html.main_template(title = Messages("start.title"), bodyClasses = None)/*7.90*/ {_display_(Seq[Any](format.raw/*7.92*/("""

    """),format.raw/*9.5*/("""<h1 class="heading-xlarge">"""),_display_(/*9.33*/Messages("start.label")),format.raw/*9.56*/("""</h1>

    <p>"""),_display_(/*11.9*/Messages("start.intro")),format.raw/*11.32*/("""</p>
    <p>"""),_display_(/*12.9*/Messages("start.p2")),format.raw/*12.29*/("""</p>

    <p>
        """),_display_(/*15.10*/form(VampireFSMController.submitStart)/*15.48*/ {_display_(Seq[Any](format.raw/*15.50*/("""
            """),format.raw/*16.13*/("""<button id="start" class="text-link-small button button-start button--get-started" type="submit">Start now</button>
        """)))}),format.raw/*17.10*/("""
    """),format.raw/*18.5*/("""</p>
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(request:Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},messages:Messages,config:Configuration): play.twirl.api.HtmlFormat.Appendable = apply()(request,messages,config)

  def f:(() => (Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration) => play.twirl.api.HtmlFormat.Appendable) = () => (request,messages,config) => apply()(request,messages,config)

  def ref: this.type = this

}


}
}

/**/
object start extends start_Scope0.start_Scope1.start
              /*
                  -- GENERATED --
                  DATE: Mon May 27 11:08:16 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/start.scala.html
                  HASH: 3fede1cd114421dbcf39805cbc73d1665e6503f2
                  MATRIX: 835->176|1005->251|1033->254|1051->264|1137->342|1176->344|1208->350|1262->378|1305->401|1346->416|1390->439|1429->452|1470->472|1520->495|1567->533|1607->535|1648->548|1804->673|1836->678|1872->684
                  LINES: 27->5|32->5|34->7|34->7|34->7|34->7|36->9|36->9|36->9|38->11|38->11|39->12|39->12|42->15|42->15|42->15|43->16|44->17|45->18|46->19
                  -- GENERATED --
              */
          