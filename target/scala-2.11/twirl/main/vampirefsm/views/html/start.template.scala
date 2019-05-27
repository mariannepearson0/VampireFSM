
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

"""),_display_(/*7.2*/vampirefsm/*7.12*/.views.html.main_template(title = "Vampire Checker", bodyClasses = None)/*7.84*/ {_display_(Seq[Any](format.raw/*7.86*/("""

    """),format.raw/*9.5*/("""<h1 class="heading-xlarge">Vampire Checker</h1>

    <p>Having unusual sympotoms?</p>
    <p>Used to love a steak slathered in garlic butter but now it terrifies you?</p>
    <p>Starting to sympathise with Nosferatu?</p>
    <strong style="font-weight: bold">Take our test now and get a head start on your immortality!</strong>

    <p>
        """),_display_(/*17.10*/form(VampireFSMController.submitStart)/*17.48*/ {_display_(Seq[Any](format.raw/*17.50*/("""
            """),format.raw/*18.13*/("""<button id="start" class="text-link-small button button-start button--get-started" type="submit">Start now</button>
        """)))}),format.raw/*19.10*/("""
    """),format.raw/*20.5*/("""</p>
""")))}),format.raw/*21.2*/("""
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
                  DATE: Mon May 27 13:23:52 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/start.scala.html
                  HASH: cb7530fb0c1b0ceb8c65c871fb0d13b4a9dd9a73
                  MATRIX: 835->176|1005->251|1033->254|1051->264|1131->336|1170->338|1202->344|1575->690|1622->728|1662->730|1703->743|1859->868|1891->873|1927->879
                  LINES: 27->5|32->5|34->7|34->7|34->7|34->7|36->9|44->17|44->17|44->17|45->18|46->19|47->20|48->21
                  -- GENERATED --
              */
          