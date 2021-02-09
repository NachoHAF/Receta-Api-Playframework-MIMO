// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nacho/Desktop/Receta-api/conf/routes
// @DATE:Tue Feb 09 15:53:42 CET 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:76
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseRecipeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def deleteRecipe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipeController.deleteRecipe",
      """
        function(recipe_id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/recipes/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("recipe_id", recipe_id0))})
        }
      """
    )
  
    // @LINE:22
    def updateRecipe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipeController.updateRecipe",
      """
        function(recipe_id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/recipes/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("recipe_id", recipe_id0))})
        }
      """
    )
  
    // @LINE:21
    def showRecipe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipeController.showRecipe",
      """
        function(recipe_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/recipes/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("recipe_id", recipe_id0))})
        }
      """
    )
  
    // @LINE:19
    def createRecipe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipeController.createRecipe",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/recipes"})
        }
      """
    )
  
    // @LINE:20
    def showRecipes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipeController.showRecipes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/recipes"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAuthorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def deleteAuthor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.deleteAuthor",
      """
        function(author_id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/authors/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("author_id", author_id0))})
        }
      """
    )
  
    // @LINE:40
    def showAuthor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.showAuthor",
      """
        function(author_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/authors/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("author_id", author_id0))})
        }
      """
    )
  
    // @LINE:37
    def showAuthors: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.showAuthors",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/authors"})
        }
      """
    )
  
    // @LINE:34
    def createAuthor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.createAuthor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/authors"})
        }
      """
    )
  
    // @LINE:43
    def updateAuthor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.updateAuthor",
      """
        function(author_id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/authors/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("author_id", author_id0))})
        }
      """
    )
  
    // @LINE:49
    def showRecipesForAuthor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.showRecipesForAuthor",
      """
        function(author_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/authors/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("author_id", author_id0)) + "/recipes"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseCategoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def updateCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.updateCategory",
      """
        function(category_name0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/categories/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("category_name", category_name0))})
        }
      """
    )
  
    // @LINE:15
    def deleteCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.deleteCategory",
      """
        function(category_name0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/categories/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("category_name", category_name0))})
        }
      """
    )
  
    // @LINE:11
    def createCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.createCategory",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/categories"})
        }
      """
    )
  
    // @LINE:13
    def showCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.showCategory",
      """
        function(category_name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/categories/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("category_name", category_name0))})
        }
      """
    )
  
    // @LINE:28
    def showRecipesForCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.showRecipesForCategory",
      """
        function(category_name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/categories/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("category_name", category_name0)) + "/recipes"})
        }
      """
    )
  
    // @LINE:12
    def showCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.showCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/categories"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:54
  class ReverseIngredientController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def showIngredients: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientController.showIngredients",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/ingredients"})
        }
      """
    )
  
    // @LINE:66
    def deleteIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientController.deleteIngredient",
      """
        function(ingredient_id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/ingredients/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("ingredient_id", ingredient_id0))})
        }
      """
    )
  
    // @LINE:71
    def showRecipesForIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientController.showRecipesForIngredient",
      """
        function(ingredient_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/ingredients/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("ingredient_id", ingredient_id0)) + "/recipes"})
        }
      """
    )
  
    // @LINE:63
    def updateIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientController.updateIngredient",
      """
        function(ingredient_id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/ingredients/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("ingredient_id", ingredient_id0))})
        }
      """
    )
  
    // @LINE:54
    def createIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientController.createIngredient",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/ingredients"})
        }
      """
    )
  
    // @LINE:60
    def showIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientController.showIngredient",
      """
        function(ingredient_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.0/ingredients/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("ingredient_id", ingredient_id0))})
        }
      """
    )
  
  }


}
