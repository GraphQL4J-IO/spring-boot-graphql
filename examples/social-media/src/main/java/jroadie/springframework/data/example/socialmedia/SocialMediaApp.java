package jroadie.springframework.data.example.socialmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"jroadie.springframework.data.example.socialmedia", "jroadie.springframework.graphql"})
//todo: auto detect component from lib instead of hard code component scan
public class SocialMediaApp {

    public static void main(String... args) {
        SpringApplication.run(SocialMediaApp.class, args);
    }

}
