package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository repo;

    public String getSimpleGreeting() {
        return "Hello World";
    }

    public Greeting saveGreeting(String message) {
        return repo.save(new Greeting(message));
    }
    public Greeting getById(Long id) {
        return repo.findById(id).orElse(null);
    }
    public List<Greeting> getAll() {
        return repo.findAll();
    }
    public Greeting update(Long id, String message) {
        Greeting g = repo.findById(id).orElse(null);
        if (g != null) {
            g.setMessage(message);
            return repo.save(g);
        }
        return null;
    }
}