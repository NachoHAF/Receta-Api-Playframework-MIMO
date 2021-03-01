
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

object recipes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Recipe],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recipes: List[Recipe]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<?xml version="1.0" enconding="UTF-8"?>
<recipes>
    """),_display_(/*4.6*/for(recipe <- recipes) yield /*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""
    """),_display_(/*5.6*/_recipe_only_name(recipe)),format.raw/*5.31*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</recipes>"""))
      }
    }
  }

  def render(recipes:List[Recipe]): play.twirl.api.XmlFormat.Appendable = apply(recipes)

  def f:((List[Recipe]) => play.twirl.api.XmlFormat.Appendable) = (recipes) => apply(recipes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-21T18:34:36.865
                  SOURCE: /Users/nacho/Desktop/Receta-api/app/views/recipes.scala.xml
                  HASH: 59b93f4749d3c4b187b0b9e6bc69a0a5ea77cc08
                  MATRIX: 909->1|1025->25|1105->80|1142->102|1181->104|1212->110|1257->135|1292->141|1319->142
                  LINES: 27->1|32->2|34->4|34->4|34->4|35->5|35->5|36->6|37->7
                  -- GENERATED --
              */
          