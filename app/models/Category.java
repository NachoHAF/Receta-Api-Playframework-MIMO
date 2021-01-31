package models;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.UpdatedTimestamp;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Categories")
public class Category extends Model {
  @Id
  private Long id_category;

  @CreatedTimestamp
  private Timestamp create_time;

  @UpdatedTimestamp
  private Timestamp update_time;

  @Constraints.Required(message = "Required_category_name")
  private String category_name;

  @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
  private List<Recipe> recipes = new ArrayList<>();


  /*finder*/


  public static final Finder<Long, Category> find = new Finder<>( Category.class );

  public static Category findByName( String name )
  {
    return(find.query().where().eq( "category_name", name ).findOne() );
  }


  public static Category findById( Long id )
  {
    if ( id == null )
    {
      throw new IllegalArgumentException( "Please fill id" );
    }
    return(find.byId( id ) );
  }


  public static List<Category> allCategories()
  {
    return(find.all() );
  }



  /* getter and setter */


  public Long getId_category()
  {
    return(id_category);
  }


  public void setId_category( Long id_category )
  {
    this.id_category = id_category;
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

  public Timestamp getTimestamp() {
    return create_time;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.create_time = timestamp;
  }

  public String getCategory_name()
  {
    return(category_name);
  }


  public void setCategory_name( String category_name )
  {
    this.category_name = category_name;
  }


  public List<Recipe> getRecipes()
  {
    return(recipes);
  }


  public void setRecipes( List<Recipe> recipes )
  {
    this.recipes = recipes;
  }

  public List<Recipe> get_all_recipes()
  {

      return Recipe.find.query().where().eq("category", this).findList();
  }
}
