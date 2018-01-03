package graphql4j.springframework.boot.graphql.example.socialmedia.test

import graphql4j.springframework.boot.graphql.example.socialmedia.content.PostRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class GraphqlRepositoryTests {

    @Autowired
    PostRepository postRepository

    @Test
    void "test find"() {
        println postRepository.class.getDeclaredMethods().flatten().name
    }

}
