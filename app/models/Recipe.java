package models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.UpdatedTimestamp;
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Recipes")
public class Recipe extends Model {
    @Id
    private Long id_recipe;

    @CreatedTimestamp
    private Timestamp create_time;

    @UpdatedTimestamp
    private Timestamp update_time;

    @Constraints.Required( message = "Required_recipe_name" )
    private String recipe_name;

    @ManyToOne
    @Constraints.Required( message = "Required_category" )
    private Category category;


    @ManyToOne
    @Constraints.Required( message = "Required_author" )
    private Author author;


    @ManyToMany( cascade = CascadeType.ALL )
    @Valid
    @JsonManagedReference
    private List<Ingredient> allIngredients = new ArrayList<>();


    /* finder */


    public static final Finder<Long, Recipe> find = new Finder<>( Recipe.class );


    public static Recipe findById( Long id )
    {
        return(find.byId( id ) );
    }


    public static List<Recipe> allRecipes()
    {
        return(find.all() );
    }


    /* getter y setter */


    public Long getId_recipe()
    {
        return(id_recipe);
    }


    public void setId_recipe( Long id_recipe )
    {
        this.id_recipe = id_recipe;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public String getRecipe_name()
    {
        return(recipe_name);
    }


    public void setRecipe_name( String recipe_name )
    {
        this.recipe_name = recipe_name;
    }


    public Category getCategory()
    {
        return(category);
    }


    public void setCategory( Category category )
    {
        this.category = category;
    }


    public List<Ingredient> getAllIngredients()
    {
        return(allIngredients);
    }


    public void setAllIngredients( List<Ingredient> allIngredients )
    {
        this.allIngredients = allIngredients;
    }


    public Author getAuthor()
    {
        return(author);
    }


    public void setAuthor( Author author )
    {
        this.author = author;
    }
}
