package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
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

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class IngredientController extends Controller {
    @Inject
    private FormFactory formFactory;

    private final play.i18n.MessagesApi messagesApi;

    @Inject
    public IngredientController(MessagesApi messagesApi) {
        this.messagesApi = messagesApi;
    }

    public boolean check_duplicate( Ingredient ingredient )
    {
        for ( int i = 0; i < Ingredient.allIngredients().size(); i++ )
        {
            if ( Ingredient.allIngredients().get( i ).getName_ingredient().equals( ingredient.getName_ingredient() ) )
            {
                return(true);
            }
        }
        return(false);
    }

    public Result createIngredient(Http.Request request) {
        {
            Messages messages = this.messagesApi.preferred(request);
            Form<Ingredient> ingredientForm = formFactory.form( Ingredient.class ).bindFromRequest( request );

            if ( ingredientForm.hasErrors() )
            {
                return(Results.badRequest( ingredientForm.errorsAsJson() ) );
            }else{
                Ingredient ingredient = ingredientForm.get();

                if ( check_duplicate( ingredient ) )
                {
                    return(Results.badRequest( messages.at("Repeat_ingredient") ) );
                }

                ingredient.save();
                return(Results.ok( messages.at("Saved_ingredient") ) );
            }
        }
    }

    public Result showIngredients(Http.Request request)
        {
            Messages messages = this.messagesApi.preferred(request);
            List<Ingredient> ingredientList = Ingredient.allIngredients();
            if ( Ingredient.allIngredients().isEmpty() )
            {
                return(Results.badRequest( messages.at("No_ingredient_list")) );
            } else {
                if ( request.accepts( "application/json" ) )
                {
                    ObjectNode result	= play.libs.Json.newObject();
                    int		counter = 0;
                    for ( Ingredient c : ingredientList )
                    {
                        result.put( Integer.toString( ++counter ), c.getName_ingredient() );
                    }
                    return(Results.ok( result ) );
                } else if ( request.accepts( "application/xml" ) )
                {
                    Content content = views.xml.ingredients.render( ingredientList );
                    return(Results.ok( content ) );
                }
            }

            return(Results.status( 406 ) );
        }

    public Result showIngredient(Long ingredient_id, Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        Ingredient ingredient = Ingredient.findById( ingredient_id );

        if ( ingredient == null )
        {
            return(Results.badRequest( messages.at("No_ingredient") ) );
        }else {
            if ( request.accepts( "application/json" ) )
            {
                ObjectNode result = play.libs.Json.newObject();
                result.put( "Ingredient_name", ingredient.getName_ingredient() );
                return(Results.ok( result ) );
            }else if ( request.accepts( "application/xml" ) )
            {
                Content content = views.xml.ingredient.render( ingredient );
                return(Results.ok( content ) );
            }
        }
        return(Results.status( 406 ) );
    }


    public Result updateIngredient(Long ingredient_id, Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        Form<Ingredient> ingredientForm = formFactory.form( Ingredient.class ).bindFromRequest( request );

        if ( ingredientForm.hasErrors() )
        {
            return(Results.badRequest( ingredientForm.errorsAsJson() ) );
        } else {
            Ingredient	ingredientform	= ingredientForm.get();
            Ingredient	ingredient		= Ingredient.findById( ingredient_id );
            if ( ingredient == null )
            {
                return(Results.badRequest( messages.at("No_found_update") ) );
            } else {
                if ( check_duplicate( ingredientform ) )
                {
                    return(Results.badRequest( messages.at("Already_exist_ingredient") ) );
                }
                ingredient.setName_ingredient( ingredientform.getName_ingredient() );
                ingredient.update();
                return(Results.ok( messages.at("Success_update") ) );
            }
        }
    }


    public Result deleteIngredient(Long ingredient_id, Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        Ingredient ingredient = Ingredient.findById( ingredient_id );
        if ( ingredient == null )
        {
            return(Results.badRequest( messages.at("No_found_delete") ) );
        } else {
            ingredient.delete();
            return(Results.ok( messages.at("Deleted")) );
        }
    }




    public Result showRecipesForIngredient(Long ingredient_id, Http.Request request)
    {
        Messages messages = this.messagesApi.preferred(request);
        Ingredient ingredient = Ingredient.findById(ingredient_id);
        if (ingredient == null) {
            return (Results.badRequest(messages.at("No_exist_this_ingredient")));
        } else {
            List<Recipe> recipesList = ingredient.get_all_recipes();
            if (recipesList.isEmpty()) {
                return Results.badRequest(messages.at("No_exist_recipes_ingredient"));
            }

            if (request.accepts("application/json")) {
                ObjectNode result = play.libs.Json.newObject();
                int counter = 0;
                for (Recipe c : recipesList) {
                    result.put(Integer.toString(++counter), c.getRecipe_name());

                }
                return (Results.ok(result));
            } else if (request.accepts("application/xml")) {
                Content content = views.xml.recipes.render(recipesList);
                return (Results.ok(content));
            }


            return(Results.status( 406 ) );
        }


    }

}
