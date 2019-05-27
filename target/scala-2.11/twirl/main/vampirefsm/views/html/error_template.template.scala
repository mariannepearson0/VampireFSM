
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_template_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object error_template_Scope1 {
import play.api.Configuration

class error_template extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,String,Messages,Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(pageTitle: String, heading: String, message: String)(implicit messages: Messages, configuration: Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/contentHeader/*4.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.19*/("""
    """),format.raw/*5.5*/("""<h1 class="heading-xlarge">"""),_display_(/*5.33*/heading),format.raw/*5.40*/("""</h1>
""")))};def /*8.2*/mainContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<p>"""),_display_(/*9.9*/message),format.raw/*9.16*/("""</p>
""")))};
Seq[Any](format.raw/*2.114*/("""

"""),format.raw/*6.2*/("""

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/govuk_wrapper(title = pageTitle, contentHeader = Some(contentHeader), mainContent = mainContent)),format.raw/*12.98*/("""
"""))
      }
    }
  }

  def render(pageTitle:String,heading:String,message:String,messages:Messages,configuration:Configuration): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle,heading,message)(messages,configuration)

  def f:((String,String,String) => (Messages,Configuration) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle,heading,message) => (messages,configuration) => apply(pageTitle,heading,message)(messages,configuration)

  def ref: this.type = this

}


}
}

/**/
object error_template extends error_template_Scope0.error_template_Scope1.error_template
              /*
                  -- GENERATED --
                  DATE: Mon May 27 11:01:14 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/error_template.scala.html
                  HASH: fb9e77d29f9b441242349b0a1d418e09a9ace0cd
                  MATRIX: 660->32|850->147|871->160|951->164|982->169|1036->197|1063->204|1092->214|1111->225|1191->229|1222->234|1251->238|1278->245|1324->144|1352->211|1381->251|1410->254|1527->350
                  LINES: 23->2|27->4|27->4|29->4|30->5|30->5|30->5|31->8|31->8|33->8|34->9|34->9|34->9|36->2|38->6|40->10|42->12|42->12
                  -- GENERATED --
              */
          