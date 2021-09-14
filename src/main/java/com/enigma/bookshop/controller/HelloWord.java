package com.enigma.bookshop.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.HashSet;

@RestController
public class HelloWord {

    @GetMapping("/hello")
    String hello(){
        return "Hello Word";
    }

    @GetMapping("/hello/{var}")
    public String pathVar(@PathVariable String var){
        return  "Path var : " + var;
    }

    @GetMapping("/req-query")
    public String queryString (@RequestParam String var){
        return "Request Param : " + var;
    }

    @PostMapping("/hello-body")
    public String reqBody(@RequestBody HashMap<String, String> mapBody){
        return "Request Body : " + mapBody;
    }

}
