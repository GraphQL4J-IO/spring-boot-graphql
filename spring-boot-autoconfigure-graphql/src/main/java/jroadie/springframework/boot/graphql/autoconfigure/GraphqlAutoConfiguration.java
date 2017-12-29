package jroadie.springframework.boot.graphql.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GraphqlProperties.class)
public class GraphqlAutoConfiguration {

    private GraphqlProperties graphqlProperties;

    public GraphqlAutoConfiguration(GraphqlProperties graphqlProperties) {
        this.graphqlProperties = graphqlProperties;
    }
}
