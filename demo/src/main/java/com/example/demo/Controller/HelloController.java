package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Spring Boot is running!123123"
    }
    @GetMapping("/hello")
    public String helloString() {
        return "Hello CI/CD";
    }
}
