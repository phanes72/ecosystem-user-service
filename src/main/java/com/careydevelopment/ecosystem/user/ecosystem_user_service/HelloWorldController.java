package com.careydevelopment.ecosystem.user.ecosystem_user_service;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloWorldController {

    @GetMapping("/helloworld")
    public Hello helloWorld() {
        return new Hello();
    }
}