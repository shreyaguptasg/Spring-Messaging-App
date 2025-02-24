package com.example.springMessagingApp.controller;

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
}

