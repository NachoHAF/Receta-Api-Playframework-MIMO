package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Author;
import models.Category;
import models.Ingredient;
import models.Recipe;
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
import java.util.Locale;



public class RecipeController extends Controller {
    @Inject
    private FormFactory formFactory;

    private final play.i18n.MessagesApi messagesApi;

    @Inject
    public RecipeController(MessagesApi messagesApi) {
        this.messagesApi = messagesApi;
    }

    public boolean check_duplicate( Recipe recipe )
    {
        for ( int i = 0; i < Recipe.allRecipes().size(); i++ )
        {
            if ( Recipe.allRecipes().get( i ).getRecipe_name().toLowerCase( Locale.ROOT ).equals( recipe.getRecipe_name().toLowerCase( Locale.ROOT ) ) )
            {
                return(true);
            }
        }
        return(false);
    }


    public boolean check_exist_ingredient( Ingredient ingredient )
    {
        return Ingredient.findById(ingredient.getId_ingredient()) == null;
    }


    public boolean check_exist_category( Category category )
    {
        return Category.findById(category.getId_category()) == null;
    }


    public boolean check_exist_author( Author author )
    {
        return Author.findById(author.getId_author()) == null;
    }


    public Result createRecipe( Http.Request request )
    {
        Messages messages = this.messagesApi.preferred(request);
        Form<Recipe> recipeForm = formFactory.form( Recipe.class ).bindFromRequest( request );

        if ( recipeForm.hasErrors() )
        {
            return(Results.badRequest( recipeForm.errorsAsJson() ) );
        } else {
            Recipe recipe = recipeForm.get();

            /* check zone */
            if ( check_duplicate( recipe ) )
            {
                return(Results.badRequest( messages.at("Repeat_recipe") ) );
            }

            if ( check_exist_category( recipe.getCategory() ))
            {
                return(Results.badRequest( messages.at("Check_exist_category") ) );
            }

            if ( check_exist_author( recipe.getAuthor() ) )
            {
                return(Results.badRequest( messages.at("Check_exist_author") ) );
            }

            for ( Ingredient i : recipe.getAllIngredients() )
            {
                if ( check_exist_ingredient( i ) )
                {
                    return(Results.badRequest( messages.at("Check_exist_ingredient") ) );
                }
            }



            recipe.save();
            return(Results.ok( messages.at("Saved_recipe") ) );
        }
    }


    public Result showRecipes( Http.Request request )
    {
        Messages messages = this.messagesApi.preferred(request);
        List<Recipe> recipeList = Recipe.allRecipes();
        if ( Recipe.allRecipes().isEmpty() )
        {
            return(Results.badRequest( messages.at("No_recipe_list")) );
        } else{
            if ( request.accepts( "application/json" ) )
            {
                ObjectNode result = play.libs.Json.newObject();
                for ( Recipe c : recipeList )
                {
                    result.put( c.getId_recipe().toString(), c.getRecipe_name() );
                }
                return(Results.ok( result ) );
            }   else if ( request.accepts( "application/xml" ) )
            {
                Content content = views.xml.recipes.render( recipeList );
                return(Results.ok( content ) );
            }
        }

        return(Results.status( 406 ) );
    }


    public Result showRecipe( Long recipe_id, Http.Request request )
    {
        Messages messages = this.messagesApi.preferred(request);
        Recipe recipe = Recipe.findById( recipe_id );

        if ( recipe == null )
        {
            return(Results.badRequest( messages.at("No_recipe") ) );
        }else  {
            if ( request.accepts( "application/json" ) )
            {
                ObjectNode result = play.libs.Json.newObject();
                result.put( "Recipe_name", recipe.getRecipe_name() );
                result.put( "Category", recipe.getCategory().getCategory_name() );
                result.put( "Author", recipe.getAuthor().getAuthor_name() );
                int counter=0;
                for ( Ingredient i : recipe.getAllIngredients() )
                {
                    result.put(Integer.toString(++counter), i.getName_ingredient() );
                }
                return(Results.ok( result ) );
            }else if ( request.accepts( "application/xml" ) )
            {
                Content content = views.xml.recipe.render( recipe );
                return(Results.ok( content ) );
            }
        }
        return(Results.status( 406 ) );
    }


    public Result updateRecipe( Long recipe_id, Http.Request request )
    {
        Messages messages = this.messagesApi.preferred(request);
        Form<Recipe> recipeForm = formFactory.form( Recipe.class ).bindFromRequest( request );

        if ( recipeForm.hasErrors() )
        {
            return(Results.badRequest( recipeForm.errorsAsJson() ) );
        } else {
            Recipe	recipeform	= recipeForm.get();
            Recipe	recipe		= Recipe.findById( recipe_id );
            /* check zone */
            if ( recipe == null )
            {
                return(Results.badRequest( messages.at("No_found_update") ) );
            }else {
                if ( check_exist_category( recipeform.getCategory() ) )
                {
                    return(Results.badRequest( messages.at("Check_exist_category") ) );
                }

                if ( check_exist_author( recipeform.getAuthor() ) )
                {
                    return(Results.badRequest( messages.at("Check_exist_author") ) );
                }

                for ( Ingredient i : recipeform.getAllIngredients() )
                {
                    if ( check_exist_ingredient( i ) )
                    {
                        return(Results.badRequest( messages.at("Check_exist_ingredient") ) );
                    }
                }

                if ( check_no_changes( recipe, recipeform ) )
                {
                    return(Results.ok( messages.at("No_changed") ) );
                }

                if ( check_ingredient_duplicate( recipeform ) )
                {
                    return(Results.badRequest( messages.at("Duplicate_ingredient") ) );
                }

                recipe.setRecipe_name( recipeform.getRecipe_name() );
                recipe.setCategory( recipeform.getCategory() );
                recipe.setAuthor( recipeform.getAuthor() );
                recipe.setAllIngredients( recipeform.getAllIngredients() );
                recipe.update();
                return(Results.ok( messages.at("Success_update") ) );
            }
        }
    }


    private boolean check_ingredient_duplicate( Recipe recipeform )
    {
        /* check if duplicate ingredients */
        for ( Ingredient j : recipeform.getAllIngredients() )
        {
            int counter = 0;
            for ( Ingredient j2 : recipeform.getAllIngredients() )
            {
                if ( j.getId_ingredient().equals( j2.getId_ingredient() ) )
                {
                    counter++;
                }
            }
            System.out.println( j.getId_ingredient() + ": " + counter );
            if ( counter >= 2 )
            {
                return(true);
            }
        }

        return(false);
    }


    private boolean check_no_changes( Recipe recipe_db, Recipe recipeform )
    {
        if ( !recipe_db.getRecipe_name().toLowerCase( Locale.ROOT ).equals( recipeform.getRecipe_name().toLowerCase( Locale.ROOT ) ) )
        {
            return(false);
        }
        if ( !recipe_db.getCategory().getId_category().equals( recipeform.getCategory().getId_category() ) )
        {
            return(false);
        }
        if ( !recipe_db.getAuthor().getId_author().equals( recipeform.getAuthor().getId_author() ) )
        {
            return(false);
        }

        /* check if change ingredients */
        for ( Ingredient i : recipe_db.getAllIngredients() )
        {
            boolean exist = false;
            for ( Ingredient i_form : recipeform.getAllIngredients() )
            {
                if (i_form.getId_ingredient().equals(i.getId_ingredient())) {
                    exist = true;
                    break;
                }
            }
            if ( !exist )
            {
                return(false);
            }
        }
        for ( Ingredient i : recipeform.getAllIngredients() )
        {
            boolean exist = false;
            for ( Ingredient i_form : recipe_db.getAllIngredients() )
            {
                if (i_form.getId_ingredient().equals(i.getId_ingredient())) {
                    exist = true;
                    break;
                }
            }
            if ( !exist )
            {
                return(false);
            }
        }

        return(true);
    }


    public Result deleteRecipe( Long recipe_id,Http.Request request )
    {
        Messages messages = this.messagesApi.preferred(request);
        Recipe recipe = Recipe.findById( recipe_id );
        if ( recipe == null )
        {
            return(Results.badRequest( messages.at("No_found_delete") ) );
        } else {
            recipe.delete();
            return(Results.ok( messages.at("Deleted") ) );
        }

    }

}

