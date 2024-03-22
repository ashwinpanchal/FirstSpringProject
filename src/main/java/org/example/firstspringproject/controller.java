package org.example.firstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class controller {
    @GetMapping("/hello/{id}")
    public String getHello(@PathVariable("id") String id) throws IOException {
        FetchTodo fetchTodo = new FetchTodo();
        return fetchTodo.getResponse(id);
    }
}
