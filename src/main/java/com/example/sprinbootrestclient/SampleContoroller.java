package com.example.sprinbootrestclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleContoroller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/world")
    public String world(){
        return "world";
    }
}
