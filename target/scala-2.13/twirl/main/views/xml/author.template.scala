
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

object author extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Author,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(author: Author):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<?xml version="1.0" encoding="UTF-8"?>
"""),_display_(/*3.2*/_author(author)))
      }
    }
  }

  def render(author:Author): play.twirl.api.XmlFormat.Appendable = apply(author)

  def f:((Author) => play.twirl.api.XmlFormat.Appendable) = (author) => apply(author)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-09T15:27:05.641
                  SOURCE: /Users/nacho/Desktop/Receta-api/app/views/author.scala.xml
                  HASH: 022ba129f2c09c5f58672ccbd0c05635391fb634
                  MATRIX: 902->1|1011->18|1076->58
                  LINES: 27->1|32->2|33->3
                  -- GENERATED --
              */
          