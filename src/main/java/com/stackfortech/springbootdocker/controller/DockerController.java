package com.stackfortech.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class DockerController {

    @GetMapping("/hello")
    public String getStarted(){

        return "Hello from endpoint exposed inside a docker container";
    }

    @GetMapping("/logout")
    public String logout(){

        return "You are successfully signed out.";
    }
}
