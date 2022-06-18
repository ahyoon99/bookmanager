package com.fastcampus.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello-world";
    }

}
