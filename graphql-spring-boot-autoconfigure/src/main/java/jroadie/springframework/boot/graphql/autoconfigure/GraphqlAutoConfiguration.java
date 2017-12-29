package jroadie.springframework.boot.graphql.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(GraphqlProperties.class)
@Import(SimpleGraphqlController.class)
public class GraphqlAutoConfiguration {

}
