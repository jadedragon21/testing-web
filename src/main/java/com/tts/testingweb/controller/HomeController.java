package com.tts.testingweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//spring.io version

//@Controller
//public class HomeController {
//
//    @RequestMapping("/")
//    public @ResponseBody
//    String greeting() {
//        return "Hello, World";
//    }
//
//}

//Lionel's version
@RestController
public class HomeController {

    @GetMapping("/")
    public String greeting() {
        return "Hello world!";
    }
}