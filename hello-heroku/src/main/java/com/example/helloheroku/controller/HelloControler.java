package com.example.helloheroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
   @GetMapping("/hello")
    public String sayHello(){
        return "Hello to heroku";
    }
}
