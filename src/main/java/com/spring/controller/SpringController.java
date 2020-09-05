package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class SpringController implements Serializable {

    @GetMapping("/hello")
    public String showHelloMsg() {
      return "Welcome to SpringBoot....";
    }

    @GetMapping("/")	
    public String displayMsg() {
      return "github-webhook"; 
    }

}
