package com.ice.first_spring_app.controller;

import com.ice.first_spring_app.domain.User;
import com.ice.first_spring_app.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController


    @RequestMapping("/hello-word")


    public class HelloWordController {
        //Post, Get, Delete, Put, Patch, Options, Head

        @Autowired
        private  HelloWordService helloWordService;




        @GetMapping
        public String helloWord(){
            return helloWordService.helloWord("Weslley");
        }
        @PostMapping ("")
        public String helloWorldPost(@RequestBody User body){
            return "Hello Word" + body.getName();
        }
    }


