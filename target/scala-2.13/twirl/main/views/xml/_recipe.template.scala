
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

object _recipe extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Recipe,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recipe: Recipe):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<recipe>
    <recipe_name>"""),_display_(/*3.19*/recipe/*3.25*/.getRecipe_name()),format.raw/*3.42*/("""</recipe_name>
    <recipe_category>"""),_display_(/*4.23*/recipe/*4.29*/.getCategory().getCategory_name()),format.raw/*4.62*/("""</recipe_category>
    <recipe_author>"""),_display_(/*5.21*/recipe/*5.27*/.getAuthor().getAuthor_name()),format.raw/*5.56*/("""</recipe_author>
    <recipe_ingredients>
        """),_display_(/*7.10*/for(ingredient <-recipe.getAllIngredients()) yield /*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/("""
        """),_display_(/*8.10*/_ingredient(ingredient)),format.raw/*8.33*/("""
        """)))}),format.raw/*9.10*/("""</recipe_ingredients>
</recipe>"""))
      }
    }
  }

  def render(recipe:Recipe): play.twirl.api.XmlFormat.Appendable = apply(recipe)

  def f:((Recipe) => play.twirl.api.XmlFormat.Appendable) = (recipe) => apply(recipe)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-09T00:48:03.221
                  SOURCE: /Users/nacho/Desktop/receta/app/views/_recipe.scala.xml
                  HASH: 9e67c5042c7c4cf05649945f6fc9604c28ece17e
                  MATRIX: 903->1|1012->18|1065->45|1079->51|1116->68|1179->105|1193->111|1246->144|1311->183|1325->189|1374->218|1451->269|1510->313|1549->315|1585->325|1628->348|1668->358
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|34->4|34->4|35->5|35->5|35->5|37->7|37->7|37->7|38->8|38->8|39->9
                  -- GENERATED --
              */
          