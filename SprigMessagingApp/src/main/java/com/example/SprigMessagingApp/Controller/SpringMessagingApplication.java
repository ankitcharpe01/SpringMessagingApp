package com.example.SprigMessagingApp.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringMessagingApplication {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From Bridgelabz!";
    }
}