
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object end_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object end_Scope1 {
import vampirefsm.controllers.routes.VampireFSMController
import play.api.Configuration

class end extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(likelihood: String)(implicit request: Request[_], messages: Messages, config: Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.95*/("""

"""),_display_(/*6.2*/vampirefsm/*6.12*/.views.html.main_template(title = Messages("start.title"), bodyClasses = None)/*6.90*/ {_display_(Seq[Any](format.raw/*6.92*/("""

    """),_display_(/*8.6*/if(likelihood == "definitely")/*8.36*/ {_display_(Seq[Any](format.raw/*8.38*/("""
        """),format.raw/*9.9*/("""<h1 class="heading-xlarge">You are definitely a vampire!</h1>
        <p>You're hunch was right, you're a certified bloodsucker.
            But don't be too disheartened, you have an eternity to get used to it!
           Find a clan to protect you and start piling up those victims.
        </p>
    """)))}),format.raw/*14.6*/("""
    """),_display_(/*15.6*/if(likelihood == "maybe")/*15.31*/ {_display_(Seq[Any](format.raw/*15.33*/("""
        """),format.raw/*16.9*/("""<h1 class="heading-xlarge">You might be a vampire!</h1>
        <p>Keep tracking your symptoms and if they get any worse take the test again.
        Start thinking about how you're going to say goodbye to your loved ones.</p>
    """)))}),format.raw/*19.6*/("""
    """),_display_(/*20.6*/if(likelihood == "definitelyNot")/*20.39*/ {_display_(Seq[Any](format.raw/*20.41*/("""
        """),format.raw/*21.9*/("""<h1 class="heading-xlarge">You are definitely not a vampire!</h1>
        <p>Congratulations your not a vampire.
            If you are disappointed with the result of this test walk around alone in parks at night.</p>
    """)))}),format.raw/*24.6*/("""
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(likelihood:String,request:Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},messages:Messages,config:Configuration): play.twirl.api.HtmlFormat.Appendable = apply(likelihood)(request,messages,config)

  def f:((String) => (Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration) => play.twirl.api.HtmlFormat.Appendable) = (likelihood) => (request,messages,config) => apply(likelihood)(request,messages,config)

  def ref: this.type = this

}


}
}

/**/
object end extends end_Scope0.end_Scope1.end
              /*
                  -- GENERATED --
                  DATE: Mon May 27 12:39:11 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/end.scala.html
                  HASH: e45d28f51c719dfe3c690231bbf8756510a21b68
                  MATRIX: 753->92|941->185|969->188|987->198|1073->276|1112->278|1144->285|1182->315|1221->317|1256->326|1589->629|1621->635|1655->660|1695->662|1731->671|1993->903|2025->909|2067->942|2107->944|2143->953|2397->1177|2429->1179
                  LINES: 26->4|31->4|33->6|33->6|33->6|33->6|35->8|35->8|35->8|36->9|41->14|42->15|42->15|42->15|43->16|46->19|47->20|47->20|47->20|48->21|51->24|52->25
                  -- GENERATED --
              */
          