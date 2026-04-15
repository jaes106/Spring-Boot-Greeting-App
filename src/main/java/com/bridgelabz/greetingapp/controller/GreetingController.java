package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.greetingapp.model.Greeting;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService service;

    @GetMapping
    public String getGreeting() {
        return service.getSimpleGreeting();
    }

    @PostMapping
    public Greeting save(@RequestParam String message) {
        return service.saveGreeting(message);
    }

    @GetMapping("/{id}")
    public Greeting getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/all")
    public List<Greeting> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Greeting update(@PathVariable Long id,
                           @RequestParam String message) {
        return service.update(id, message);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }
}