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
}

