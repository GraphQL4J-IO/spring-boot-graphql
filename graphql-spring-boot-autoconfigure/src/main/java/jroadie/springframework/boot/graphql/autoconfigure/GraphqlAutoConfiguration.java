package jroadie.springframework.boot.graphql.autoconfigure;

import jroadie.springframework.graphql.GraphqlController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(GraphqlController.class)
@EnableConfigurationProperties(GraphqlProperties.class)
public class GraphqlAutoConfiguration {

    private GraphqlProperties graphqlProperties;

    public GraphqlAutoConfiguration(GraphqlProperties graphqlProperties) {
        this.graphqlProperties = graphqlProperties;
    }
}
