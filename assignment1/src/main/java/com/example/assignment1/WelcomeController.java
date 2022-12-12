package com.example.assignment1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/name")
    public String getName(){
        return "My name is Little Weasel";
    }

    @GetMapping("/age")
    public String getAge(){
        return "My age is 10";
    }

    @GetMapping("/check/status")
    public String checkStatus(){
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }
}
