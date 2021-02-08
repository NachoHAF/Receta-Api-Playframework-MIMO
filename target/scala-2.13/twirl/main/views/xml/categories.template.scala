
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

object categories extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Category],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categories: List[Category]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<?xml version="1.0" enconding="UTF-8"?>
<categories>
    """),_display_(/*4.6*/for(category <- categories) yield /*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""
    """),_display_(/*5.6*/_category(category)),format.raw/*5.25*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</categories>"""))
      }
    }
  }

  def render(categories:List[Category]): play.twirl.api.XmlFormat.Appendable = apply(categories)

  def f:((List[Category]) => play.twirl.api.XmlFormat.Appendable) = (categories) => apply(categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-09T00:48:03.136
                  SOURCE: /Users/nacho/Desktop/receta/app/views/categories.scala.xml
                  HASH: 19feeafa1d86c7b6bdfc6e46ea7444ef9e600049
                  MATRIX: 914->1|1035->30|1118->88|1160->115|1199->117|1230->123|1269->142|1304->148|1331->149
                  LINES: 27->1|32->2|34->4|34->4|34->4|35->5|35->5|36->6|37->7
                  -- GENERATED --
              */
          