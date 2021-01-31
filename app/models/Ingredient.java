package models;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.UpdatedTimestamp;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Ingredients")
public class Ingredient extends Model {


    @Id
    private Long id_ingredient;

    @CreatedTimestamp
    private Timestamp create_time;

    @UpdatedTimestamp
    private Timestamp update_time;

    @Constraints.Required(message = "Required_name_ingredient")
    private String name_ingredient;

    @ManyToMany(mappedBy = "allIngredients")
    private ArrayList<Recipe> allRecipes = new ArrayList<>();



    //finder
    public static final Finder<Long, Ingredient> find = new Finder<>(Ingredient.class);

    public static Ingredient findById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Please fill id");
        }
        return find.byId(id);
    }

    public static List<Ingredient> allIngredients(){
        return find.all();
    }

    //getter y setter

    public Long getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(Long id_ingredient) {
        this.id_ingredient = id_ingredient;
    }

    public Timestamp getTimestamp() {
        return create_time;
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

    public void setTimestamp(Timestamp timestamp) {
        this.create_time = timestamp;
    }

    public String getName_ingredient() {
        return name_ingredient;
    }

    public void setName_ingredient(String name_ingredient) {
        this.name_ingredient = name_ingredient;
    }

    public ArrayList<Recipe> getAllRecipes() {
        return allRecipes;
    }

    public void setAllRecipes(ArrayList<Recipe> allRecipes) {
        this.allRecipes = allRecipes;
    }

    public List<Recipe> get_all_recipes() {
        return Recipe.find.query().where().eq("allIngredients", this).findList();
    }
}
