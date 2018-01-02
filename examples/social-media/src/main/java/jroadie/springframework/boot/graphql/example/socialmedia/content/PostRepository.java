package jroadie.springframework.boot.graphql.example.socialmedia.content;

import jroadie.springframework.graphql.stereotype.GraphqlRepository;
import org.springframework.data.jpa.repository.JpaRepository;

@GraphqlRepository
public interface PostRepository extends JpaRepository<Post, Long> {



}
