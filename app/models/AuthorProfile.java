package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import validators.Phonenumber;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "AuthorProfiles")
public class AuthorProfile extends Model {


    @Id
    private Long id_profile;

    @Constraints.Required(message="Required_name_real")
    private String name_real;

    @Email
    @Constraints.Required(message = "Required_email")
    private String email;

    //@Constraints.Required(message = "Required_phone")
    @Phonenumber
    private Long phone;

    @Constraints.Required(message = "Required_direction")
    private String direction;

    @OneToOne(mappedBy="authorProfile")
    private Author author;


    //finder
    public static final Finder<Long, AuthorProfile> find = new Finder<>(AuthorProfile.class);

    public static AuthorProfile findById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Please fill id");
        }
        return find.byId(id);
    }

    public static List<AuthorProfile> allIngredients(){
        return find.all();
    }

    //getter y setter


    public Long getId_profile() {
        return id_profile;
    }

    public void setId_profile(Long id_profile) {
        this.id_profile = id_profile;
    }

    public String getName_real() {
        return name_real;
    }

    public void setName_real(String name_real) {
        this.name_real = name_real;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
