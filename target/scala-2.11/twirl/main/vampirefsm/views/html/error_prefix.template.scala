
package vampirefsm.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_prefix_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class error_prefix extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[_])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""
"""),_display_(/*2.2*/if(form.hasErrors)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
    """),_display_(/*3.6*/Messages("error.prefix")),format.raw/*3.30*/("""
""")))}),format.raw/*4.2*/("""
"""))
      }
    }
  }

  def render(form:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(form)(messages)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (form) => (messages) => apply(form)(messages)

  def ref: this.type = this

}


}

/**/
object error_prefix extends error_prefix_Scope0.error_prefix
              /*
                  -- GENERATED --
                  DATE: Mon May 27 13:23:52 BST 2019
                  SOURCE: /Users/mariannepearson/Documents/VampireFSM/app/vampirefsm/views/error_prefix.scala.html
                  HASH: 475da2981c0e817f9097925c8a3a307f9bbda7a5
                  MATRIX: 633->1|772->45|799->47|825->65|863->66|894->72|938->96|969->98
                  LINES: 22->1|27->1|28->2|28->2|28->2|29->3|29->3|30->4
                  -- GENERATED --
              */
          