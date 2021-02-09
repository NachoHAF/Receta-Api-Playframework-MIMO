
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

object ingredients extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Ingredient],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ingredients: List[Ingredient]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<?xml version="1.0" enconding="UTF-8"?>
<ingredients>
    """),_display_(/*4.6*/for(ingredient <- ingredients) yield /*4.36*/ {_display_(Seq[Any](format.raw/*4.38*/("""
    """),_display_(/*5.6*/_ingredient(ingredient)),format.raw/*5.29*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</ingredients>"""))
      }
    }
  }

  def render(ingredients:List[Ingredient]): play.twirl.api.XmlFormat.Appendable = apply(ingredients)

  def f:((List[Ingredient]) => play.twirl.api.XmlFormat.Appendable) = (ingredients) => apply(ingredients)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-09T15:27:05.679
                  SOURCE: /Users/nacho/Desktop/Receta-api/app/views/ingredients.scala.xml
                  HASH: 7b9900a8cf69ed8bc14f92198ef125b9d3e14aca
                  MATRIX: 917->1|1041->33|1125->92|1170->122|1209->124|1240->130|1283->153|1318->159|1345->160
                  LINES: 27->1|32->2|34->4|34->4|34->4|35->5|35->5|36->6|37->7
                  -- GENERATED --
              */
          