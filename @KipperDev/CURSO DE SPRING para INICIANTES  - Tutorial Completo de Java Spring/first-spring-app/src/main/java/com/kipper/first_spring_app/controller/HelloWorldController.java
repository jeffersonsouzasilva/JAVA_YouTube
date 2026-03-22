package com.kipper.first_spring_app.controller;

import com.kipper.first_spring_app.domain.User;
import com.kipper.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
// STATELESS -> token, a cada nova requisição eu recebo todas informações que preciso para fazer aquela funcionalidade que o cliente pediu ,
// STATEFULL -> o estado de cada cliente é mantido no servidor
@RequestMapping("/hello-world")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

//    public HelloWorldController(HelloWorldService helloWorldService){
//        this.helloWorldService = helloWorldService;
//    }

    // post, get, delete, put, patch, options, head
    // GET /hello-world/get
    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Kipper");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter,@RequestBody User body) {
        //return "Hello World " + body.getName() + id;
        return "Hello World " + filter;
    }

}
