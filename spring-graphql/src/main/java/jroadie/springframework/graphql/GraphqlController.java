package jroadie.springframework.graphql;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.Map;

@Controller
@RequestMapping("/graphql") //todo: read from properties
public class GraphqlController {

    @PostMapping
    public Map<String, ?> index() {
        System.out.println("7777777777777777777777777777");
        return Collections.emptyMap();
    }

}
