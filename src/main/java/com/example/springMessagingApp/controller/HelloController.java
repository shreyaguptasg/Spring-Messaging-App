package com.example.springMessagingApp.controller;

import com.example.springMessagingApp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request: Default Hello Message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // GET request with query parameter to return a personalized hello message
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // GET request with path variable to return a personalized hello message
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // POST request to return a hello message with first and last name from request body
    @PostMapping("/post")
    public String sayHelloWithFullName(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // PUT request with path variable and query parameter to return a personalized hello message
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}

