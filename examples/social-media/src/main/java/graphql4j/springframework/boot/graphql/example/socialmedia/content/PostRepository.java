package graphql4j.springframework.boot.graphql.example.socialmedia.content;

import graphql4j.springframework.graphql.stereotype.GraphqlRepository;
import org.springframework.data.jpa.repository.JpaRepository;

@GraphqlRepository
public interface PostRepository extends JpaRepository<Post, Long> {



}
