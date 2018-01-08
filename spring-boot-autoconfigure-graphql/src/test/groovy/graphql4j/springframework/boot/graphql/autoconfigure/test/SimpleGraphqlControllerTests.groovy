package graphql4j.springframework.boot.graphql.autoconfigure.test

import graphql4j.springframework.boot.graphql.autoconfigure.SimpleGraphqlController
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner.class)
@WebMvcTest(value = SimpleGraphqlController.class, secure = false)
class SimpleGraphqlControllerTests {

    private MockMvc mockMvc

    @Test
    void hello() {
        mockMvc.perform(get("/graphql"))
                .andExpect(status().isOk())
    }


}
