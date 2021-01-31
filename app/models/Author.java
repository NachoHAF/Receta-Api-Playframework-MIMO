package models;


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
@Table(name="Authors")
public class Author extends Model {
    @Id
    private Long id_author;

    @CreatedTimestamp
    private Timestamp create_time;

    @UpdatedTimestamp
    private Timestamp update_time;

    @Constraints.Required(message="Required_author_name")
    private String author_name;

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @Constraints.Required(message = "Required_author_profile")
    private AuthorProfile authorProfile;

    @OneToMany( mappedBy = "author",cascade = CascadeType.ALL )
    private List<Recipe> recipes = new ArrayList<>();


    /* finder */


    public static final Finder<Long, Author> find = new Finder<>( Author.class );

    public static Author findById( Long id )
    {
        if ( id == null )
        {
            throw new IllegalArgumentException( "Please fill id" );
        }
        return(find.byId( id ) );
    }


    public static List<Author> allAuthors()
    {
        return(find.all() );
    }


    /* getter y setter */


    public Long getId_author()
    {
        return(id_author);
    }


    public void setId_author( Long id_author )
    {
        this.id_author = id_author;
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

    public String getAuthor_name()
    {
        return(author_name);
    }


    public void setAuthor_name( String author_name )
    {
        this.author_name = author_name;
    }


    public AuthorProfile getAuthorProfile() {
        return authorProfile;
    }


    public void setAuthorProfile(AuthorProfile authorProfile) {
        this.authorProfile = authorProfile;
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
        return Recipe.find.query().where().eq("author", this).findList();
    }
}
