
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
    navTitle = Some(Messages("app.name")),
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
""")))};def /*69.2*/content/*69.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*69.13*/("""
"""),_display_(/*70.2*/uiLayouts/*70.11*/.main_content(article = mainContent,
    mainClass = mainClass,
    mainDataAttributes = mainDataAttributes,
    mainContentHeader = mainContentHeader,
    serviceInfo = serviceInfo,
    getHelpForm = getHelpForm,
    sidebar = sidebar)),format.raw/*76.23*/("""
""")))};def /*22.2*/titleWithSuffix/*22.17*/ = {{ title + " - " + Messages("servicename.titleSuffix") }};def /*65.2*/getHelpForm/*65.13*/ = {{
    uiHelpers.reportAProblemLink(configuration.getString("reportAProblemPartialUrl").get, configuration.getString("reportAProblemNonJSUrl").get)
}};
Seq[Any](format.raw/*13.100*/("""

"""),format.raw/*20.2*/("""

"""),format.raw/*22.76*/("""

"""),format.raw/*24.21*/("""

"""),format.raw/*32.2*/("""

"""),format.raw/*34.18*/("""

"""),format.raw/*38.2*/("""

"""),format.raw/*47.2*/("""

"""),format.raw/*49.16*/("""
"""),format.raw/*50.18*/("""

"""),format.raw/*57.2*/("""

"""),format.raw/*63.2*/("""

"""),format.raw/*67.2*/("""

"""),format.raw/*77.2*/("""

"""),_display_(/*79.2*/hmrcGovUkTemplate(Some(titleWithSuffix), bodyClasses)/*79.55*/(head, bodyEnd, insideHeader, afterHeader, footerTop, Some(uiLayouts.footer_links()), nav = true)/*79.152*/(content)),format.raw/*79.161*/("""
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
                  DATE: Mon May 27 11:01:15 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/govuk_wrapper.scala.html
                  HASH: 9ea2171c8fd5b737e53694758291336d3bbe8479
                  MATRIX: 873->167|1428->646|1440->650|1521->654|1549->656|1567->665|1639->716|1671->721|1750->857|1773->871|1851->879|1872->891|1953->895|1981->897|1999->906|2163->1049|2188->1054|2208->1065|2286->1073|2298->1077|2379->1081|2407->1083|2421->1089|2455->1102|2480->1107|2495->1114|2576->1118|2604->1120|2622->1129|2900->1386|2925->1391|2943->1400|3021->1407|3041->1418|3119->1426|3139->1437|3220->1441|3248->1443|3266->1452|3397->1562|3422->1567|3448->1584|3529->1588|3557->1590|3593->1617|3633->1619|3665->1625|3683->1634|3743->1673|3775->1675|3800->1846|3815->1853|3896->1857|3924->1859|3942->1868|4199->2104|4224->780|4248->795|4321->1680|4341->1691|4525->643|4554->777|4584->854|4614->876|4643->1051|4673->1070|4702->1104|4731->1388|4761->1405|4790->1423|4819->1564|4848->1677|4877->1843|4906->2106|4935->2109|4997->2162|5104->2259|5135->2268
                  LINES: 25->4|38->15|38->15|40->15|41->16|41->16|43->18|44->19|45->24|45->24|47->26|47->26|49->26|50->27|50->27|54->31|55->34|55->34|57->36|57->36|59->36|60->37|60->37|60->37|61->40|61->40|63->40|64->41|64->41|69->46|70->49|70->49|72->50|72->50|74->52|74->52|76->52|77->53|77->53|80->56|81->59|81->59|83->59|84->60|84->60|84->60|85->61|85->61|85->61|86->62|87->69|87->69|89->69|90->70|90->70|96->76|97->22|97->22|97->65|97->65|100->13|102->20|104->22|106->24|108->32|110->34|112->38|114->47|116->49|117->50|119->57|121->63|123->67|125->77|127->79|127->79|127->79|127->79
                  -- GENERATED --
              */
          