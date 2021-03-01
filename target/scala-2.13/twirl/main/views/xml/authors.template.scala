
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

object authors extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Author],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authors: List[Author]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<?xml version="1.0" enconding="UTF-8"?>
<authors>
    """),_display_(/*4.6*/for(author <- authors) yield /*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""
    """),_display_(/*5.6*/_author(author)),format.raw/*5.21*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</authors>"""))
      }
    }
  }

  def render(authors:List[Author]): play.twirl.api.XmlFormat.Appendable = apply(authors)

  def f:((List[Author]) => play.twirl.api.XmlFormat.Appendable) = (authors) => apply(authors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-21T18:34:36.930
                  SOURCE: /Users/nacho/Desktop/Receta-api/app/views/authors.scala.xml
                  HASH: 7136015f3af3326754ff24dee51431ac65a87b83
                  MATRIX: 909->1|1025->25|1105->80|1142->102|1181->104|1212->110|1247->125|1282->131|1309->132
                  LINES: 27->1|32->2|34->4|34->4|34->4|35->5|35->5|36->6|37->7
                  -- GENERATED --
              */
          