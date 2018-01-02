package jroadie.springframework.boot.graphql.example.socialmedia.user;

import jroadie.springframework.boot.graphql.example.socialmedia.content.Post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Author extends User {

    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 2, max = 256)
    private String firstName;

    @Size(min = 2, max = 256)
    private String lastName;

    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
