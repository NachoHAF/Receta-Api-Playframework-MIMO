package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Author;
import models.AuthorProfile;
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


public class AuthorController extends Controller {
    @Inject
    private FormFactory formFactory;

    private final play.i18n.MessagesApi messagesApi;

    @Inject
    public AuthorController(MessagesApi messagesApi) {
        this.messagesApi = messagesApi;
    }

    public boolean check_duplicate(Author author) {
        for (int i = 0; i < Author.allAuthors().size(); i++) {
            if (Author.allAuthors().get(i).getAuthor_name().equals(author.getAuthor_name())) {
                return (true);
            }
        }
        return (false);
    }


    public boolean check_no_change(Author author_form, Author autor_bd) {

        System.out.println("formulario" + author_form.getAuthor_name());
        System.out.println("bd" + autor_bd.getAuthor_name());

        if ( author_form.getAuthor_name().equals(autor_bd.getAuthor_name())&&
                author_form.getAuthorProfile().getDirection().equals(autor_bd.getAuthorProfile().getDirection()) &&
                author_form.getAuthorProfile().getEmail().equals(autor_bd.getAuthorProfile().getEmail()) &&
                author_form.getAuthorProfile().getName_real().equals(autor_bd.getAuthorProfile().getName_real()) &&
                author_form.getAuthorProfile().getPhone().equals(autor_bd.getAuthorProfile().getPhone())
        )

        { return (true);}


        return false;
    }


    public boolean check_duplicate_update(Author author_form, Long id){


        List<Author> list_authors_same_name = Author.find.query().where().eq("author_name", author_form.getAuthor_name()).findList();

        for (Author a: list_authors_same_name) {
            if (a.getAuthor_name().equals(author_form.getAuthor_name()))
            {
                if (a.getId_author().equals(id)){continue;}
                else { return true;}
            }
        }


        return false;
    }


    public Result createAuthor(Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        Form<Author> authorForm = formFactory.form(Author.class).bindFromRequest(request);

        if (authorForm.hasErrors()) {
            return (Results.badRequest(authorForm.errorsAsJson()));
        } else {
            Author author = authorForm.get();

            if (check_duplicate(author)) {
                return (Results.badRequest(messages.at("Repeat_author")));
            }

            author.save();
            return (Results.ok(messages.at("Saved_author")));
        }
    }


    public Result showAuthors(Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        List<Author> authorList = Author.allAuthors();
        if (Author.allAuthors().isEmpty()) {
            return (Results.badRequest(messages.at("No_author_list")));
        } else {
            if (request.accepts("application/json")) {
                ObjectNode result = play.libs.Json.newObject();
                int counter = 0;
                for (Author c : authorList) {
                    result.put(Integer.toString(++counter), c.getAuthor_name());
                }
                return (Results.ok(result));
            } else if (request.accepts("application/xml")) {
                Content content = views.xml.authors.render(authorList);
                return (Results.ok(content));
            }
        }

        return (Results.status(406));
    }


    public Result showAuthor(Long author_id, Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        Author author = Author.findById(author_id);

        if (author == null) {
            return (Results.badRequest(messages.at("No_author")));
        } else {
            if (request.accepts("application/json")) {
                ObjectNode result = play.libs.Json.newObject();
                result.put("Author_name", author.getAuthor_name());
                return (Results.ok(result));
            } else if (request.accepts("application/xml")) {
                Content content = views.xml.author.render(author);
                return (Results.ok(content));
            }
        }
        return (Results.status(406));
    }




    public Result updateAuthor(Long author_id, Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        Form<Author> authorForm = formFactory.form(Author.class).bindFromRequest(request);

        if (authorForm.hasErrors()) {
            return (Results.badRequest(authorForm.errorsAsJson()));
        } else {

            Author authorform = authorForm.get();
            Author author = Author.findById(author_id);


            if (author == null) {
                return (Results.badRequest(messages.at("No_found_update")));
            } else {
                if (check_no_change(authorform, author)) {
                    System.out.println(authorform.getAuthor_name());
                    return (Results.badRequest(messages.at("No_changed")));
                }else {
                    if (check_duplicate_update(authorform, author_id)){
                        return (Results.badRequest(messages.at("Already_exist_author")));

                    }
                }


            }
            AuthorProfile ap = author.getAuthorProfile();

            ap.setDirection(authorform.getAuthorProfile().getDirection());
            ap.setEmail(authorform.getAuthorProfile().getEmail());
            ap.setPhone(authorform.getAuthorProfile().getPhone());
            ap.setName_real(authorform.getAuthorProfile().getName_real());
            ap.update();

            author.setAuthor_name(authorform.getAuthor_name());
            author.setAuthorProfile(ap);


            author.update();
            return (Results.ok(messages.at("Success_update")));
        }
    }


    public Result deleteAuthor(Long author_id,Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        Author author = Author.findById(author_id);
        if (author == null) {
            return (Results.badRequest(messages.at("No_found_delete")));
        } else {
            author.delete();
            return (Results.ok(messages.at("Deleted")));
        }
    }


    public Result showRecipesForAuthor(Long author_id, Http.Request request)
    {
        Messages messages = this.messagesApi.preferred(request);
        Author author = Author.findById(author_id);
        if (author == null) {
            return (Results.badRequest(messages.at("No_exist_this_author")));
        } else {
            List<Recipe> recipesList = author.get_all_recipes();
            if (recipesList.isEmpty()) {
                return Results.badRequest(messages.at("No_exist_recipes_author"));
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


            return (Results.status(406));
        }


    }
}
