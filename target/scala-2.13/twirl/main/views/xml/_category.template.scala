
package views.xml

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.xml._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object _category extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Category,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(category: Category):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<category>
   <category_name>"""),_display_(/*3.20*/category/*3.28*/.getCategory_name()),format.raw/*3.47*/("""</category_name>
   <created_time>"""),_display_(/*4.19*/category/*4.27*/.getCreate_time()),format.raw/*4.44*/("""</created_time>
</category>"""))
      }
    }
  }

  def render(category:Category): play.twirl.api.XmlFormat.Appendable = apply(category)

  def f:((Category) => play.twirl.api.XmlFormat.Appendable) = (category) => apply(category)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-09T00:48:03.163
                  SOURCE: /Users/nacho/Desktop/receta/app/views/_category.scala.xml
                  HASH: 3a8dd1e3b778287e5ad9df73ab9d5b7c8e9b73ee
                  MATRIX: 907->1|1020->22|1076->52|1092->60|1131->79|1192->114|1208->122|1245->139
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|34->4|34->4
                  -- GENERATED --
              */
          