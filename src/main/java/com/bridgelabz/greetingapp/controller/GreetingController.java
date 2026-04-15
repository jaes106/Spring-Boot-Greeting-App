package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService service;

    @GetMapping
    public String getGreeting() {
        return service.getSimpleGreeting();
    }

    @GetMapping("/custom")
    public String getCustomGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        if (firstName != null && lastName != null)
            return "Hello " + firstName + " " + lastName;

        if (firstName != null)
            return "Hello " + firstName;

        if (lastName != null)
            return "Hello " + lastName;

        return "Hello World";
    }
}