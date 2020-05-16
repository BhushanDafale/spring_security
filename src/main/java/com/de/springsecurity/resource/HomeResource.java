package com.de.springsecurity.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String globalResource() {
        return "Welcome to Global Resource";
    }

    @GetMapping("/user")
    public String userResource() {
        return "User resource";
    }

    @GetMapping("/admin")
    public String adminResource() {
        return "admin resource";
    }

}
