package com.kipper.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// STATELESS -> token, a cada nova requisição eu recebo todas informações que preciso para fazer aquela funcionalidade que o cliente pediu ,
// STATEFULL -> o estado de cada cliente é mantido no servidor
@RequestMapping("/hello-world")
public class HelloWorldController {
    // post, get, delete, put, patch, options, head
    // GET /hello-world/get
    @GetMapping
    public String helloWorld(){
        return "Hello Video!";
    }

}
