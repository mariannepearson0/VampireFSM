
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object govuk_wrapper_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object govuk_wrapper_Scope1 {
import layouts.{govuk_template => hmrcGovUkTemplate}
import uk.gov.hmrc.play.views.html.{helpers => uiHelpers, layouts => uiLayouts}
import play.api.Configuration

class govuk_wrapper extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template12[String,Option[String],Option[Html],Option[String],Html,Option[Html],Html,Html,Option[Html],Seq[String],Messages,Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String,
        mainClass: Option[String] = None,
        mainDataAttributes: Option[Html] = None,
        bodyClasses: Option[String] = None,
        sidebar: Html = HtmlFormat.empty,
        contentHeader: Option[Html] = None,
        mainContent: Html = HtmlFormat.empty,
        serviceInfoContent: Html = HtmlFormat.empty,
        scriptElem: Option[Html] = None,
        gaCode: Seq[String] = Seq.empty)(implicit messages: Messages, configuration: Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*15.2*/head/*15.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.10*/("""
"""),_display_(/*16.2*/uiLayouts/*16.11*/.head(
    linkElem = None,
    headScripts = None)),format.raw/*18.24*/("""
    """),format.raw/*19.5*/("""<meta name="format-detection" content="telephone=no"/>
""")))};def /*24.2*/headerNavLinks/*24.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any]())};def /*26.2*/insideHeader/*26.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.18*/("""
"""),_display_(/*27.2*/uiLayouts/*27.11*/.header_nav(
    navTitle = Some("Vampire Checker"),
    navTitleLink = None,
    showBetaLink = false,
    navLinks = Some(headerNavLinks))),format.raw/*31.37*/("""
""")))};def /*34.2*/afterHeader/*34.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any]())};def /*36.2*/gaJS/*36.6*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*36.10*/("""
"""),_display_(/*37.2*/gaCode/*37.8*/.map(Html(_))),format.raw/*37.21*/("""
""")))};def /*40.2*/bodyEnd/*40.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*40.13*/("""
"""),_display_(/*41.2*/uiLayouts/*41.11*/.footer(analyticsToken = configuration.getString("google-analytics.token"),
    analyticsHost = configuration.getString("google-analytics.host").get,
    ssoUrl = None,
    scriptElem = scriptElem,
    gaCalls = None,
    analyticsAdditionalJs = Some(gaJS))),format.raw/*46.40*/("""
""")))};def /*49.2*/footerTop/*49.11*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any]())};def /*50.2*/footerLinks/*50.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any]())};def /*52.2*/serviceInfo/*52.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*52.17*/("""
"""),_display_(/*53.2*/uiLayouts/*53.11*/.serviceInfo(
    betaBanner = HtmlFormat.empty,
    includeGridWrapper = false,
    Some(serviceInfoContent))),format.raw/*56.30*/("""
""")))};def /*59.2*/mainContentHeader/*59.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*59.23*/("""
"""),_display_(/*60.2*/if(contentHeader.isDefined)/*60.29*/ {_display_(Seq[Any](format.raw/*60.31*/("""
    """),_display_(/*61.6*/uiLayouts/*61.15*/.main_content_header(contentHeader.get)),format.raw/*61.54*/("""
""")))}),format.raw/*62.2*/("""
""")))};def /*65.2*/content/*65.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*65.13*/("""
"""),_display_(/*66.2*/uiLayouts/*66.11*/.main_content(article = mainContent,
    mainClass = mainClass,
    mainDataAttributes = mainDataAttributes,
    mainContentHeader = mainContentHeader,
    serviceInfo = serviceInfo,
    sidebar = sidebar)),format.raw/*71.23*/("""
""")))};def /*22.2*/titleWithSuffix/*22.17*/ = {{title}};
Seq[Any](format.raw/*13.100*/("""

"""),format.raw/*20.2*/("""

"""),format.raw/*22.28*/("""

"""),format.raw/*24.21*/("""

"""),format.raw/*32.2*/("""

"""),format.raw/*34.18*/("""

"""),format.raw/*38.2*/("""

"""),format.raw/*47.2*/("""

"""),format.raw/*49.16*/("""
"""),format.raw/*50.18*/("""

"""),format.raw/*57.2*/("""

"""),format.raw/*63.2*/("""

"""),format.raw/*72.2*/("""

"""),_display_(/*74.2*/hmrcGovUkTemplate(Some(titleWithSuffix), bodyClasses)/*74.55*/(head, bodyEnd, insideHeader, afterHeader, footerTop, Some(uiLayouts.footer_links()), nav = true)/*74.152*/(content)),format.raw/*74.161*/("""
"""))
      }
    }
  }

  def render(title:String,mainClass:Option[String],mainDataAttributes:Option[Html],bodyClasses:Option[String],sidebar:Html,contentHeader:Option[Html],mainContent:Html,serviceInfoContent:Html,scriptElem:Option[Html],gaCode:Seq[String],messages:Messages,configuration:Configuration): play.twirl.api.HtmlFormat.Appendable = apply(title,mainClass,mainDataAttributes,bodyClasses,sidebar,contentHeader,mainContent,serviceInfoContent,scriptElem,gaCode)(messages,configuration)

  def f:((String,Option[String],Option[Html],Option[String],Html,Option[Html],Html,Html,Option[Html],Seq[String]) => (Messages,Configuration) => play.twirl.api.HtmlFormat.Appendable) = (title,mainClass,mainDataAttributes,bodyClasses,sidebar,contentHeader,mainContent,serviceInfoContent,scriptElem,gaCode) => (messages,configuration) => apply(title,mainClass,mainDataAttributes,bodyClasses,sidebar,contentHeader,mainContent,serviceInfoContent,scriptElem,gaCode)(messages,configuration)

  def ref: this.type = this

}


}
}

/**/
object govuk_wrapper extends govuk_wrapper_Scope0.govuk_wrapper_Scope1.govuk_wrapper
              /*
                  -- GENERATED --
                  DATE: Mon May 27 13:23:52 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/govuk_wrapper.scala.html
                  HASH: 2589d6d2755f136ec81e72529bdbf45042dd0ea3
                  MATRIX: 873->167|1428->646|1440->650|1521->654|1549->656|1567->665|1639->716|1671->721|1750->809|1773->823|1851->831|1872->843|1953->847|1981->849|1999->858|2160->998|2185->1003|2205->1014|2283->1022|2295->1026|2376->1030|2404->1032|2418->1038|2452->1051|2477->1056|2492->1063|2573->1067|2601->1069|2619->1078|2897->1335|2922->1340|2940->1349|3018->1356|3038->1367|3116->1375|3136->1386|3217->1390|3245->1392|3263->1401|3394->1511|3419->1516|3445->1533|3526->1537|3554->1539|3590->1566|3630->1568|3662->1574|3680->1583|3740->1622|3772->1624|3797->1629|3812->1636|3893->1640|3921->1642|3939->1651|4165->1856|4190->780|4214->795|4257->643|4286->777|4316->806|4346->828|4375->1000|4405->1019|4434->1053|4463->1337|4493->1354|4522->1372|4551->1513|4580->1626|4609->1858|4638->1861|4700->1914|4807->2011|4838->2020
                  LINES: 25->4|38->15|38->15|40->15|41->16|41->16|43->18|44->19|45->24|45->24|47->26|47->26|49->26|50->27|50->27|54->31|55->34|55->34|57->36|57->36|59->36|60->37|60->37|60->37|61->40|61->40|63->40|64->41|64->41|69->46|70->49|70->49|72->50|72->50|74->52|74->52|76->52|77->53|77->53|80->56|81->59|81->59|83->59|84->60|84->60|84->60|85->61|85->61|85->61|86->62|87->65|87->65|89->65|90->66|90->66|95->71|96->22|96->22|97->13|99->20|101->22|103->24|105->32|107->34|109->38|111->47|113->49|114->50|116->57|118->63|120->72|122->74|122->74|122->74|122->74
                  -- GENERATED --
              */
          