
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object summary_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object summary_Scope1 {
import play.api.Configuration
import vampirefsm.controllers.routes.VampireFSMController
import vampirefsm.models.VampirecheckerFrontendModel

class summary extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[VampirecheckerFrontendModel],Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(vampirecheckerFrontendForm : Form[VampirecheckerFrontendModel])(implicit request: Request[_], messages: Messages, config: Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.139*/("""

"""),_display_(/*8.2*/vampirefsm/*8.12*/.views.html.main_template(title = Messages("summary.title"), bodyClasses = None)/*8.92*/ {_display_(Seq[Any](format.raw/*8.94*/("""

        """),format.raw/*10.9*/("""<h1 class="heading-xlarge">"""),_display_(/*10.37*/Messages("summary.label")),format.raw/*10.62*/("""</h1>


        <dl class="govuk-check-your-answers cya-questions-short">
            <div>
                <dt class="cya-question">
                    """),_display_(/*16.22*/Messages("summary.header.parameters")),format.raw/*16.59*/("""
                """),format.raw/*17.17*/("""</dt>
                <dd class="cya-answer" id="parameter1">
                    """),_display_(/*19.22*/vampirecheckerFrontendForm("parameter1")/*19.62*/.value),format.raw/*19.68*/("""
                """),format.raw/*20.17*/("""</dd>
                <dd class="cya-change">
                    <a href="#">
                      """),_display_(/*23.24*/Messages("summary.link.change")),format.raw/*23.55*/("""
                      """),format.raw/*24.23*/("""<span class="visuallyhidden">"""),_display_(/*24.53*/Messages("summary.header.parameters")),format.raw/*24.90*/("""</span>
                    </a>
                </dd>
            </div>
            <div>
                <dt class="cya-question">
                    """),_display_(/*30.22*/Messages("summary.header.contactDetails")),format.raw/*30.63*/("""
                """),format.raw/*31.17*/("""</dt>
                <dd class="cya-answer" id="contactDetails">
                    """),_display_(/*33.22*/if(vampirecheckerFrontendForm("emailAddress").value)/*33.74*/{_display_(Seq[Any](format.raw/*33.75*/("""<span class="display-block">""")))}),_display_(/*33.105*/vampirecheckerFrontendForm("emailAddress")/*33.147*/.value),format.raw/*33.153*/(""" """),_display_(/*33.155*/if(vampirecheckerFrontendForm("emailAddress").value)/*33.207*/{_display_(Seq[Any](format.raw/*33.208*/("""</span>""")))}),format.raw/*33.216*/("""
                    """),_display_(/*34.22*/if(vampirecheckerFrontendForm("telephoneNumber").value)/*34.77*/{_display_(Seq[Any](format.raw/*34.78*/("""<span class="display-block">""")))}),_display_(/*34.108*/vampirecheckerFrontendForm("telephoneNumber")/*34.153*/.value),format.raw/*34.159*/(""" """),_display_(/*34.161*/if(vampirecheckerFrontendForm("telephoneNumber").value)/*34.216*/{_display_(Seq[Any](format.raw/*34.217*/("""</span>""")))}),format.raw/*34.225*/("""
                """),format.raw/*35.17*/("""</dd>
                <dd class="cya-change">
                    <a href="#">
                      """),_display_(/*38.24*/Messages("summary.link.change")),format.raw/*38.55*/("""
                      """),format.raw/*39.23*/("""<span class="visuallyhidden">"""),_display_(/*39.53*/Messages("summary.header.contactDetails")),format.raw/*39.94*/("""</span>
                    </a>
                </dd>
            </div>
        </dl>

        <a href="#" class="button form-field--submit" href=""""),_display_(/*45.62*/VampireFSMController/*45.82*/.start),format.raw/*45.88*/("""" role="button">"""),_display_(/*45.105*/Messages("button.submit")),format.raw/*45.130*/("""</a>


""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(vampirecheckerFrontendForm:Form[VampirecheckerFrontendModel],request:Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},messages:Messages,config:Configuration): play.twirl.api.HtmlFormat.Appendable = apply(vampirecheckerFrontendForm)(request,messages,config)

  def f:((Form[VampirecheckerFrontendModel]) => (Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,Configuration) => play.twirl.api.HtmlFormat.Appendable) = (vampirecheckerFrontendForm) => (request,messages,config) => apply(vampirecheckerFrontendForm)(request,messages,config)

  def ref: this.type = this

}


}
}

/**/
object summary extends summary_Scope0.summary_Scope1.summary
              /*
                  -- GENERATED --
                  DATE: Mon May 27 11:01:14 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/summary.scala.html
                  HASH: b7a84ec670d8193681b5852cf38a6fc6467c8387
                  MATRIX: 845->147|1078->284|1106->287|1124->297|1212->377|1251->379|1288->389|1343->417|1389->442|1571->597|1629->634|1674->651|1784->734|1833->774|1860->780|1905->797|2034->899|2086->930|2137->953|2194->983|2252->1020|2434->1175|2496->1216|2541->1233|2655->1320|2716->1372|2755->1373|2816->1403|2868->1445|2896->1451|2926->1453|2988->1505|3028->1506|3068->1514|3117->1536|3181->1591|3220->1592|3281->1622|3336->1667|3364->1673|3394->1675|3459->1730|3499->1731|3539->1739|3584->1756|3713->1858|3765->1889|3816->1912|3873->1942|3935->1983|4112->2133|4141->2153|4168->2159|4213->2176|4260->2201|4298->2209
                  LINES: 27->6|32->6|34->8|34->8|34->8|34->8|36->10|36->10|36->10|42->16|42->16|43->17|45->19|45->19|45->19|46->20|49->23|49->23|50->24|50->24|50->24|56->30|56->30|57->31|59->33|59->33|59->33|59->33|59->33|59->33|59->33|59->33|59->33|59->33|60->34|60->34|60->34|60->34|60->34|60->34|60->34|60->34|60->34|60->34|61->35|64->38|64->38|65->39|65->39|65->39|71->45|71->45|71->45|71->45|71->45|74->48
                  -- GENERATED --
              */
          