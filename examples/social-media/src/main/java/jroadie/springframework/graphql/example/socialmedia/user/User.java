package jroadie.springframework.graphql.example.socialmedia.user;

import javax.validation.constraints.Size;

public abstract class User {

    @Size(min = 2, max = 256)
    private String username;

    @Size(min = 2, max = 256)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
