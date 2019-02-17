package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {


    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }
}
