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
        return Collections.emptyMap();
    }

}
