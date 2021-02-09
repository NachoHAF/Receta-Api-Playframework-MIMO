// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nacho/Desktop/Receta-api/conf/routes
// @DATE:Tue Feb 09 15:53:42 CET 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_5: controllers.HomeController,
  // @LINE:11
  CategoryController_3: controllers.CategoryController,
  // @LINE:19
  RecipeController_1: controllers.RecipeController,
  // @LINE:34
  AuthorController_2: controllers.AuthorController,
  // @LINE:54
  IngredientController_0: controllers.IngredientController,
  // @LINE:76
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_5: controllers.HomeController,
    // @LINE:11
    CategoryController_3: controllers.CategoryController,
    // @LINE:19
    RecipeController_1: controllers.RecipeController,
    // @LINE:34
    AuthorController_2: controllers.AuthorController,
    // @LINE:54
    IngredientController_0: controllers.IngredientController,
    // @LINE:76
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_5, CategoryController_3, RecipeController_1, AuthorController_2, IngredientController_0, Assets_4, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, CategoryController_3, RecipeController_1, AuthorController_2, IngredientController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0""", """controllers.HomeController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/categories""", """controllers.CategoryController.createCategory(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/categories""", """controllers.CategoryController.showCategories(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/categories/""" + "$" + """category_name<[^/]+>""", """controllers.CategoryController.showCategory(category_name:String, request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/categories/""" + "$" + """category_name<[^/]+>""", """controllers.CategoryController.updateCategory(category_name:String, request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/categories/""" + "$" + """category_name<[^/]+>""", """controllers.CategoryController.deleteCategory(category_name:String, request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/recipes""", """controllers.RecipeController.createRecipe(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/recipes""", """controllers.RecipeController.showRecipes(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/recipes/""" + "$" + """recipe_id<[^/]+>""", """controllers.RecipeController.showRecipe(recipe_id:Long, request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/recipes/""" + "$" + """recipe_id<[^/]+>""", """controllers.RecipeController.updateRecipe(recipe_id:Long, request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/recipes/""" + "$" + """recipe_id<[^/]+>""", """controllers.RecipeController.deleteRecipe(recipe_id:Long, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/categories/""" + "$" + """category_name<[^/]+>/recipes""", """controllers.CategoryController.showRecipesForCategory(category_name:String, request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/authors""", """controllers.AuthorController.createAuthor(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/authors""", """controllers.AuthorController.showAuthors(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/authors/""" + "$" + """author_id<[^/]+>""", """controllers.AuthorController.showAuthor(author_id:Long, request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/authors/""" + "$" + """author_id<[^/]+>""", """controllers.AuthorController.updateAuthor(author_id:Long, request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/authors/""" + "$" + """author_id<[^/]+>""", """controllers.AuthorController.deleteAuthor(author_id:Long, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/authors/""" + "$" + """author_id<[^/]+>/recipes""", """controllers.AuthorController.showRecipesForAuthor(author_id:Long, request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/ingredients""", """controllers.IngredientController.createIngredient(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/ingredients""", """controllers.IngredientController.showIngredients(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/ingredients/""" + "$" + """ingredient_id<[^/]+>""", """controllers.IngredientController.showIngredient(ingredient_id:Long, request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/ingredients/""" + "$" + """ingredient_id<[^/]+>""", """controllers.IngredientController.updateIngredient(ingredient_id:Long, request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/ingredients/""" + "$" + """ingredient_id<[^/]+>""", """controllers.IngredientController.deleteIngredient(ingredient_id:Long, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.0/ingredients/""" + "$" + """ingredient_id<[^/]+>/recipes""", """controllers.IngredientController.showRecipesForIngredient(ingredient_id:Long, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_5.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0")))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_5.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """api/1.0""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CategoryController_createCategory2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/categories")))
  )
  private[this] lazy val controllers_CategoryController_createCategory2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CategoryController_3.createCategory(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "createCategory",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/1.0/categories""",
      """Routes for categories""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CategoryController_showCategories3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/categories")))
  )
  private[this] lazy val controllers_CategoryController_showCategories3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CategoryController_3.showCategories(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "showCategories",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/categories""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CategoryController_showCategory4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/categories/"), DynamicPart("category_name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_showCategory4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CategoryController_3.showCategory(fakeValue[String], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "showCategory",
      Seq(classOf[String], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/categories/""" + "$" + """category_name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CategoryController_updateCategory5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/categories/"), DynamicPart("category_name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_updateCategory5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CategoryController_3.updateCategory(fakeValue[String], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "updateCategory",
      Seq(classOf[String], classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """api/1.0/categories/""" + "$" + """category_name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CategoryController_deleteCategory6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/categories/"), DynamicPart("category_name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_deleteCategory6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CategoryController_3.deleteCategory(fakeValue[String], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "deleteCategory",
      Seq(classOf[String], classOf[play.mvc.Http.Request]),
      "DELETE",
      this.prefix + """api/1.0/categories/""" + "$" + """category_name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_RecipeController_createRecipe7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/recipes")))
  )
  private[this] lazy val controllers_RecipeController_createRecipe7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      RecipeController_1.createRecipe(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipeController",
      "createRecipe",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/1.0/recipes""",
      """Routes for recipes""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_RecipeController_showRecipes8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/recipes")))
  )
  private[this] lazy val controllers_RecipeController_showRecipes8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      RecipeController_1.showRecipes(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipeController",
      "showRecipes",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/recipes""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_RecipeController_showRecipe9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/recipes/"), DynamicPart("recipe_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipeController_showRecipe9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      RecipeController_1.showRecipe(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipeController",
      "showRecipe",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/recipes/""" + "$" + """recipe_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RecipeController_updateRecipe10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/recipes/"), DynamicPart("recipe_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipeController_updateRecipe10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      RecipeController_1.updateRecipe(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipeController",
      "updateRecipe",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """api/1.0/recipes/""" + "$" + """recipe_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_RecipeController_deleteRecipe11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/recipes/"), DynamicPart("recipe_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipeController_deleteRecipe11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      RecipeController_1.deleteRecipe(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipeController",
      "deleteRecipe",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "DELETE",
      this.prefix + """api/1.0/recipes/""" + "$" + """recipe_id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_CategoryController_showRecipesForCategory12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/categories/"), DynamicPart("category_name", """[^/]+""",true), StaticPart("/recipes")))
  )
  private[this] lazy val controllers_CategoryController_showRecipesForCategory12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CategoryController_3.showRecipesForCategory(fakeValue[String], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "showRecipesForCategory",
      Seq(classOf[String], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/categories/""" + "$" + """category_name<[^/]+>/recipes""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_AuthorController_createAuthor13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/authors")))
  )
  private[this] lazy val controllers_AuthorController_createAuthor13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthorController_2.createAuthor(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "createAuthor",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/1.0/authors""",
      """Routes for authors
 To create authors""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_AuthorController_showAuthors14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/authors")))
  )
  private[this] lazy val controllers_AuthorController_showAuthors14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthorController_2.showAuthors(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "showAuthors",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/authors""",
      """ To get all authors""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_AuthorController_showAuthor15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/authors/"), DynamicPart("author_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_showAuthor15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthorController_2.showAuthor(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "showAuthor",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/authors/""" + "$" + """author_id<[^/]+>""",
      """ To get current author""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_AuthorController_updateAuthor16_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/authors/"), DynamicPart("author_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_updateAuthor16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthorController_2.updateAuthor(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "updateAuthor",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """api/1.0/authors/""" + "$" + """author_id<[^/]+>""",
      """ To update current author""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_AuthorController_deleteAuthor17_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/authors/"), DynamicPart("author_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_deleteAuthor17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthorController_2.deleteAuthor(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "deleteAuthor",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "DELETE",
      this.prefix + """api/1.0/authors/""" + "$" + """author_id<[^/]+>""",
      """ To delete current author""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_AuthorController_showRecipesForAuthor18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/authors/"), DynamicPart("author_id", """[^/]+""",true), StaticPart("/recipes")))
  )
  private[this] lazy val controllers_AuthorController_showRecipesForAuthor18_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      AuthorController_2.showRecipesForAuthor(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "showRecipesForAuthor",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/authors/""" + "$" + """author_id<[^/]+>/recipes""",
      """Routes for authors with recipes""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_IngredientController_createIngredient19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/ingredients")))
  )
  private[this] lazy val controllers_IngredientController_createIngredient19_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      IngredientController_0.createIngredient(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientController",
      "createIngredient",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/1.0/ingredients""",
      """Routes for ingredients
 To create ingredients""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_IngredientController_showIngredients20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/ingredients")))
  )
  private[this] lazy val controllers_IngredientController_showIngredients20_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      IngredientController_0.showIngredients(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientController",
      "showIngredients",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/ingredients""",
      """ To get all ingredients""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_IngredientController_showIngredient21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/ingredients/"), DynamicPart("ingredient_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredientController_showIngredient21_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      IngredientController_0.showIngredient(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientController",
      "showIngredient",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/ingredients/""" + "$" + """ingredient_id<[^/]+>""",
      """ To get current ingredient""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_IngredientController_updateIngredient22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/ingredients/"), DynamicPart("ingredient_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredientController_updateIngredient22_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      IngredientController_0.updateIngredient(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientController",
      "updateIngredient",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """api/1.0/ingredients/""" + "$" + """ingredient_id<[^/]+>""",
      """ To update current ingredient""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_IngredientController_deleteIngredient23_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/ingredients/"), DynamicPart("ingredient_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredientController_deleteIngredient23_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      IngredientController_0.deleteIngredient(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientController",
      "deleteIngredient",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "DELETE",
      this.prefix + """api/1.0/ingredients/""" + "$" + """ingredient_id<[^/]+>""",
      """ To delete current ingredient""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_IngredientController_showRecipesForIngredient24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.0/ingredients/"), DynamicPart("ingredient_id", """[^/]+""",true), StaticPart("/recipes")))
  )
  private[this] lazy val controllers_IngredientController_showRecipesForIngredient24_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      IngredientController_0.showRecipesForIngredient(fakeValue[Long], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientController",
      "showRecipesForIngredient",
      Seq(classOf[Long], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/1.0/ingredients/""" + "$" + """ingredient_id<[^/]+>/recipes""",
      """Routes for recipes with ingredients""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_Assets_versioned25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned25_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_5.index())
      }
  
    // @LINE:7
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_5.index())
      }
  
    // @LINE:11
    case controllers_CategoryController_createCategory2_route(params@_) =>
      call { 
        controllers_CategoryController_createCategory2_invoker.call(
          req => CategoryController_3.createCategory(req))
      }
  
    // @LINE:12
    case controllers_CategoryController_showCategories3_route(params@_) =>
      call { 
        controllers_CategoryController_showCategories3_invoker.call(
          req => CategoryController_3.showCategories(req))
      }
  
    // @LINE:13
    case controllers_CategoryController_showCategory4_route(params@_) =>
      call(params.fromPath[String]("category_name", None)) { (category_name) =>
        controllers_CategoryController_showCategory4_invoker.call(
          req => CategoryController_3.showCategory(category_name, req))
      }
  
    // @LINE:14
    case controllers_CategoryController_updateCategory5_route(params@_) =>
      call(params.fromPath[String]("category_name", None)) { (category_name) =>
        controllers_CategoryController_updateCategory5_invoker.call(
          req => CategoryController_3.updateCategory(category_name, req))
      }
  
    // @LINE:15
    case controllers_CategoryController_deleteCategory6_route(params@_) =>
      call(params.fromPath[String]("category_name", None)) { (category_name) =>
        controllers_CategoryController_deleteCategory6_invoker.call(
          req => CategoryController_3.deleteCategory(category_name, req))
      }
  
    // @LINE:19
    case controllers_RecipeController_createRecipe7_route(params@_) =>
      call { 
        controllers_RecipeController_createRecipe7_invoker.call(
          req => RecipeController_1.createRecipe(req))
      }
  
    // @LINE:20
    case controllers_RecipeController_showRecipes8_route(params@_) =>
      call { 
        controllers_RecipeController_showRecipes8_invoker.call(
          req => RecipeController_1.showRecipes(req))
      }
  
    // @LINE:21
    case controllers_RecipeController_showRecipe9_route(params@_) =>
      call(params.fromPath[Long]("recipe_id", None)) { (recipe_id) =>
        controllers_RecipeController_showRecipe9_invoker.call(
          req => RecipeController_1.showRecipe(recipe_id, req))
      }
  
    // @LINE:22
    case controllers_RecipeController_updateRecipe10_route(params@_) =>
      call(params.fromPath[Long]("recipe_id", None)) { (recipe_id) =>
        controllers_RecipeController_updateRecipe10_invoker.call(
          req => RecipeController_1.updateRecipe(recipe_id, req))
      }
  
    // @LINE:23
    case controllers_RecipeController_deleteRecipe11_route(params@_) =>
      call(params.fromPath[Long]("recipe_id", None)) { (recipe_id) =>
        controllers_RecipeController_deleteRecipe11_invoker.call(
          req => RecipeController_1.deleteRecipe(recipe_id, req))
      }
  
    // @LINE:28
    case controllers_CategoryController_showRecipesForCategory12_route(params@_) =>
      call(params.fromPath[String]("category_name", None)) { (category_name) =>
        controllers_CategoryController_showRecipesForCategory12_invoker.call(
          req => CategoryController_3.showRecipesForCategory(category_name, req))
      }
  
    // @LINE:34
    case controllers_AuthorController_createAuthor13_route(params@_) =>
      call { 
        controllers_AuthorController_createAuthor13_invoker.call(
          req => AuthorController_2.createAuthor(req))
      }
  
    // @LINE:37
    case controllers_AuthorController_showAuthors14_route(params@_) =>
      call { 
        controllers_AuthorController_showAuthors14_invoker.call(
          req => AuthorController_2.showAuthors(req))
      }
  
    // @LINE:40
    case controllers_AuthorController_showAuthor15_route(params@_) =>
      call(params.fromPath[Long]("author_id", None)) { (author_id) =>
        controllers_AuthorController_showAuthor15_invoker.call(
          req => AuthorController_2.showAuthor(author_id, req))
      }
  
    // @LINE:43
    case controllers_AuthorController_updateAuthor16_route(params@_) =>
      call(params.fromPath[Long]("author_id", None)) { (author_id) =>
        controllers_AuthorController_updateAuthor16_invoker.call(
          req => AuthorController_2.updateAuthor(author_id, req))
      }
  
    // @LINE:46
    case controllers_AuthorController_deleteAuthor17_route(params@_) =>
      call(params.fromPath[Long]("author_id", None)) { (author_id) =>
        controllers_AuthorController_deleteAuthor17_invoker.call(
          req => AuthorController_2.deleteAuthor(author_id, req))
      }
  
    // @LINE:49
    case controllers_AuthorController_showRecipesForAuthor18_route(params@_) =>
      call(params.fromPath[Long]("author_id", None)) { (author_id) =>
        controllers_AuthorController_showRecipesForAuthor18_invoker.call(
          req => AuthorController_2.showRecipesForAuthor(author_id, req))
      }
  
    // @LINE:54
    case controllers_IngredientController_createIngredient19_route(params@_) =>
      call { 
        controllers_IngredientController_createIngredient19_invoker.call(
          req => IngredientController_0.createIngredient(req))
      }
  
    // @LINE:57
    case controllers_IngredientController_showIngredients20_route(params@_) =>
      call { 
        controllers_IngredientController_showIngredients20_invoker.call(
          req => IngredientController_0.showIngredients(req))
      }
  
    // @LINE:60
    case controllers_IngredientController_showIngredient21_route(params@_) =>
      call(params.fromPath[Long]("ingredient_id", None)) { (ingredient_id) =>
        controllers_IngredientController_showIngredient21_invoker.call(
          req => IngredientController_0.showIngredient(ingredient_id, req))
      }
  
    // @LINE:63
    case controllers_IngredientController_updateIngredient22_route(params@_) =>
      call(params.fromPath[Long]("ingredient_id", None)) { (ingredient_id) =>
        controllers_IngredientController_updateIngredient22_invoker.call(
          req => IngredientController_0.updateIngredient(ingredient_id, req))
      }
  
    // @LINE:66
    case controllers_IngredientController_deleteIngredient23_route(params@_) =>
      call(params.fromPath[Long]("ingredient_id", None)) { (ingredient_id) =>
        controllers_IngredientController_deleteIngredient23_invoker.call(
          req => IngredientController_0.deleteIngredient(ingredient_id, req))
      }
  
    // @LINE:71
    case controllers_IngredientController_showRecipesForIngredient24_route(params@_) =>
      call(params.fromPath[Long]("ingredient_id", None)) { (ingredient_id) =>
        controllers_IngredientController_showRecipesForIngredient24_invoker.call(
          req => IngredientController_0.showRecipesForIngredient(ingredient_id, req))
      }
  
    // @LINE:76
    case controllers_Assets_versioned25_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned25_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
