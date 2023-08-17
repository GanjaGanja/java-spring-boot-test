package com.example.javaspringtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // this is example of basic GET endpoint
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
