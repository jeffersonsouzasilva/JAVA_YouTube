package br.com.souza.spring_boot_essencials.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController("/v1/hello")
public class HelloWorldController {

//    @GetMapping
//    public String helloWorld(){
//        return "Hello World";
//    }

//    @GetMapping
//    public ResponseEntity<String> helloWorld(){
//        return ResponseEntity.ok("Hello World!");
//    }

//    @DeleteMapping
//    public ResponseEntity<String> helloWorld(){
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String get1(@PathVariable("id") String id){
        return "Hello World " + id;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String get2(@RequestParam(value = "name" , required = false) String name){
        return "Hello World " + name;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String post(){
        return "Hello World novo POST!";
    }

}
