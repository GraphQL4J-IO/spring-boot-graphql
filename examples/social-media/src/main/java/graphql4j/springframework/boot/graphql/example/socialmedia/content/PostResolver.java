package graphql4j.springframework.boot.graphql.example.socialmedia.content;

import graphql4j.GraphqlResult;
import graphql4j.springframework.graphql.stereotype.GraphqlMutation;
import graphql4j.springframework.graphql.stereotype.GraphqlQuery;
import graphql4j.springframework.graphql.stereotype.GraphqlResolver;

@GraphqlResolver
public class PostResolver {

    @GraphqlQuery
    public GraphqlResult findPostById(Integer id) {
        return null;
    }

    @GraphqlMutation
    public GraphqlResult createPost() {
        return null;
    }

}
