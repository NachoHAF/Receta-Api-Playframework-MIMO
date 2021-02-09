// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nacho/Desktop/Receta-api/conf/routes
// @DATE:Tue Feb 09 15:53:42 CET 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:76
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:19
  class ReverseRecipeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def deleteRecipe(recipe_id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/1.0/recipes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("recipe_id", recipe_id)))
    }
  
    // @LINE:22
    def updateRecipe(recipe_id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/1.0/recipes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("recipe_id", recipe_id)))
    }
  
    // @LINE:21
    def showRecipe(recipe_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/recipes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("recipe_id", recipe_id)))
    }
  
    // @LINE:19
    def createRecipe(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/1.0/recipes")
    }
  
    // @LINE:20
    def showRecipes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/recipes")
    }
  
  }

  // @LINE:34
  class ReverseAuthorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def deleteAuthor(author_id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/1.0/authors/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("author_id", author_id)))
    }
  
    // @LINE:40
    def showAuthor(author_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/authors/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("author_id", author_id)))
    }
  
    // @LINE:37
    def showAuthors(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/authors")
    }
  
    // @LINE:34
    def createAuthor(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/1.0/authors")
    }
  
    // @LINE:43
    def updateAuthor(author_id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/1.0/authors/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("author_id", author_id)))
    }
  
    // @LINE:49
    def showRecipesForAuthor(author_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/authors/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("author_id", author_id)) + "/recipes")
    }
  
  }

  // @LINE:11
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def updateCategory(category_name:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/1.0/categories/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("category_name", category_name)))
    }
  
    // @LINE:15
    def deleteCategory(category_name:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/1.0/categories/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("category_name", category_name)))
    }
  
    // @LINE:11
    def createCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/1.0/categories")
    }
  
    // @LINE:13
    def showCategory(category_name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/categories/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("category_name", category_name)))
    }
  
    // @LINE:28
    def showRecipesForCategory(category_name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/categories/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("category_name", category_name)) + "/recipes")
    }
  
    // @LINE:12
    def showCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/categories")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }

  // @LINE:54
  class ReverseIngredientController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def showIngredients(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/ingredients")
    }
  
    // @LINE:66
    def deleteIngredient(ingredient_id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/1.0/ingredients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("ingredient_id", ingredient_id)))
    }
  
    // @LINE:71
    def showRecipesForIngredient(ingredient_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/ingredients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("ingredient_id", ingredient_id)) + "/recipes")
    }
  
    // @LINE:63
    def updateIngredient(ingredient_id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/1.0/ingredients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("ingredient_id", ingredient_id)))
    }
  
    // @LINE:54
    def createIngredient(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/1.0/ingredients")
    }
  
    // @LINE:60
    def showIngredient(ingredient_id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.0/ingredients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("ingredient_id", ingredient_id)))
    }
  
  }


}
