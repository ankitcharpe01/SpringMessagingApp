package com.example.SprigMessagingApp.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SpringMessagingApplication {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From Bridgelabz";
    }

    @GetMapping("/hello/query")
    public String getMapping(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/hello/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/hello/post")
    public String postRequest(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/hello/put/{firstName}")
    public String putRequest(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
