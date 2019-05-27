
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_template_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object main_template_Scope1 {
import uk.gov.hmrc.play.views.html.layouts
import play.api.Configuration

class main_template extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template10[String,Option[Html],Option[Html],Option[String],Option[String],Option[Html],Html,Messages,Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String,
  sidebarLinks: Option[Html] = None,
  contentHeader: Option[Html] = None,
  bodyClasses: Option[String] = None,
  mainClass: Option[String] = None,
  scriptElem: Option[Html] = None)(mainContent: Html)(implicit messages: Messages, request : Request[_], configuration: Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/serviceInfoContent/*10.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any]())};def /*12.2*/sidebar/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/if(sidebarLinks.isDefined)/*13.32*/ {_display_(Seq[Any](format.raw/*13.34*/("""
        """),_display_(/*14.10*/layouts/*14.17*/.sidebar(sidebarLinks.get, Some("sidebar"))),format.raw/*14.60*/("""
    """)))}),format.raw/*15.6*/("""
""")))};
Seq[Any](format.raw/*8.135*/("""

"""),format.raw/*10.25*/("""

"""),format.raw/*16.2*/("""

"""),_display_(/*18.2*/govuk_wrapper(title,
               mainClass,
               bodyClasses = bodyClasses,
               sidebar = sidebar,
               contentHeader = contentHeader,
               mainContent = layouts.article(mainContent),
               serviceInfoContent = serviceInfoContent,
               scriptElem = scriptElem)),format.raw/*25.40*/("""
"""))
      }
    }
  }

  def render(title:String,sidebarLinks:Option[Html],contentHeader:Option[Html],bodyClasses:Option[String],mainClass:Option[String],scriptElem:Option[Html],mainContent:Html,messages:Messages,request:Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},configuration:Configuration): play.twirl.api.HtmlFormat.Appendable = apply(title,sidebarLinks,contentHeader,bodyClasses,mainClass,scriptElem)(mainContent)(messages,request,configuration)

  def f:((String,Option[Html],Option[Html],Option[String],Option[String],Option[Html]) => (Html) => (Messages,Request[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Configuration) => play.twirl.api.HtmlFormat.Appendable) = (title,sidebarLinks,contentHeader,bodyClasses,mainClass,scriptElem) => (mainContent) => (messages,request,configuration) => apply(title,sidebarLinks,contentHeader,bodyClasses,mainClass,scriptElem)(mainContent)(messages,request,configuration)

  def ref: this.type = this

}


}
}

/**/
object main_template extends main_template_Scope0.main_template_Scope1.main_template
              /*
                  -- GENERATED --
                  DATE: Mon May 27 13:23:52 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/main_template.scala.html
                  HASH: 1f95c08880381ba65a9c1fefb2a52c5856601c7e
                  MATRIX: 843->76|1221->378|1248->396|1326->404|1341->411|1422->415|1454->421|1489->447|1529->449|1566->459|1582->466|1646->509|1682->515|1724->375|1754->401|1783->517|1812->520|2156->843
                  LINES: 26->3|35->10|35->10|37->12|37->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|42->15|44->8|46->10|48->16|50->18|57->25
                  -- GENERATED --
              */
          