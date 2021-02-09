
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

object category extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Category,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(category: Category):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<?xml version="1.0" encoding="UTF-8"?>
"""),_display_(/*3.2*/_category(category)))
      }
    }
  }

  def render(category:Category): play.twirl.api.XmlFormat.Appendable = apply(category)

  def f:((Category) => play.twirl.api.XmlFormat.Appendable) = (category) => apply(category)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-09T15:27:05.650
                  SOURCE: /Users/nacho/Desktop/Receta-api/app/views/category.scala.xml
                  HASH: 3fd99fe8400dc9641ddb91247f82c3f97a0b9c88
                  MATRIX: 906->1|1019->22|1084->62
                  LINES: 27->1|32->2|33->3
                  -- GENERATED --
              */
          