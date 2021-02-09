package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Category;
import models.Recipe;
import play.cache.SyncCacheApi;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.Messages;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;
import play.twirl.api.Content;

import javax.inject.Inject;
import java.util.List;


public class CategoryController extends Controller {

  @Inject
  private FormFactory formFactory;

  private final SyncCacheApi cache;
  private final play.i18n.MessagesApi messagesApi;

  @Inject
  public CategoryController(SyncCacheApi cache, MessagesApi messagesApi) {
    this.cache = cache;
    this.messagesApi = messagesApi;
  }


  public boolean check_duplicate( Category category )
  {
    for ( int i = 0; i < Category.allCategories().size(); i++ )
    {
      if ( Category.allCategories().get( i ).getCategory_name().equals( category.getCategory_name() ) )
      {
        return(true);
      }
    }
    return(false);
  }


  public Result createCategory( Http.Request request )
  {
    Messages messages = this.messagesApi.preferred(request);
    Form<Category> categoryForm = formFactory.form( Category.class ).bindFromRequest( request );

    if ( categoryForm.hasErrors() )
    {
      return(Results.badRequest( categoryForm.errorsAsJson() ) );
    } else {
      Category category = categoryForm.get();

      if ( check_duplicate( category ) )
      {

        return(Results.badRequest( messages.at("Repeat_category") ) );
      }
      category.save();
      return(Results.ok( messages.at("Saved_category") ) );
    }
  }


  public Result showCategories( Http.Request request )
  {
    List<Category> categoryList =cache.getOrElseUpdate("name", Category::allCategories,30);
    Messages messages = this.messagesApi.preferred(request);
    if ( Category.allCategories().isEmpty() )
    {
      return(Results.badRequest( messages.at("No_category_list") ) );
    } else {
      if ( request.accepts( "application/json" ) )
      {
        ObjectNode	result	= play.libs.Json.newObject();
        int	counter = 0;
        for ( Category c : categoryList )
        {
          ObjectNode  pair = play.libs.Json.newObject();
          pair.put( "name", c.getCategory_name() );
          pair.put("created time", c.getTimestamp().toString() );
          result.set(Integer.toString( ++counter ), pair);
        }
        return(Results.ok( result ) );
      } else if ( request.accepts( "application/xml" ) )
      {
        Content content = views.xml.categories.render( categoryList );
        return(Results.ok( content ) );
      }
    }

    return(Results.status( 406 ) );
  }


  public Result showCategory( String category_name, Http.Request request )
  {
    Messages messages = this.messagesApi.preferred(request);
    Category category = Category.findByName( category_name );

    if ( category == null )
    {
      return(Results.badRequest( messages.at("No_category") ) );
    } else {
      if ( request.accepts( "application/json" ) )
      {
        ObjectNode result = play.libs.Json.newObject();
        result.put( category.getId_category().toString(), category.getCategory_name() );
        result.put("Created time", category.getTimestamp().toString());
        return(Results.ok( result ) );
      } else if ( request.accepts( "application/xml" ) )
      {
        Content content = views.xml.category.render( category );
        return(Results.ok( content ) );
      }
    }
    return(Results.status( 406 ) );
  }





  public Result updateCategory( String category_name, Http.Request request )
  {
    Messages messages = this.messagesApi.preferred(request);
    Form<Category> categoryForm = formFactory.form( Category.class ).bindFromRequest( request );

    if ( categoryForm.hasErrors() )
    {
      return(Results.badRequest( categoryForm.errorsAsJson() ) );
    } else {
      Category	categoryform	= categoryForm.get();
      Category	category	= Category.findByName( category_name );
      if ( category == null )
      {
        return(Results.badRequest( messages.at("No_found_update") ) );
      } else {
        if ( check_duplicate( categoryform ) )
        {
          return(Results.badRequest( messages.at("Already_exist") ) );
        }
        category.setCategory_name( categoryform.getCategory_name() );
        category.update();
        return(Results.ok( messages.at("Success_update") ) );
      }
    }
  }


  public Result deleteCategory( String category_name, Http.Request request )
  {
    Messages messages = this.messagesApi.preferred(request);
    Category category = Category.findByName( category_name );
    if ( category == null )
    {
      return(Results.badRequest( messages.at("No_found_delete") ) );
    } else {
      category.delete();
      return(Results.ok( messages.at("Deleted") ) );
    }
  }


  public Result showRecipesForCategory(String category_name, Http.Request request) {

    Messages messages = this.messagesApi.preferred(request);
    Category category = Category.findByName(category_name);
    if ( category == null )
    {
        return(Results.badRequest( messages.at("No_exist_this_category") ) );
    }
    else
    {
         List<Recipe> recipesList = category.get_all_recipes();
         if (recipesList.isEmpty())
         {
              return Results.badRequest( messages.at("No_exist_recipes") );
         }

          if ( request.accepts( "application/json" ) )
          {
            ObjectNode	result	= play.libs.Json.newObject();
            int	counter = 0;
            for ( Recipe c : recipesList )
            {
              result.put( Integer.toString( ++counter ), c.getRecipe_name() );

            }
            return(Results.ok( result ) );
          } else if ( request.accepts( "application/xml" ) )
          {
            Content content = views.xml.recipes.render( recipesList );
            return(Results.ok( content ) );
          }

    }
    return(Results.status( 406 ) );
  }
}
