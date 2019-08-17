package com.stackfortech.springbootdocker.controller;

import com.stackfortech.springbootdocker.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController("/api/user")
public class UserController {

    @GetMapping
    public User getUser(){
        return new User("stackfortech","Version Control | Github Tutorial | GIT | DevOps","DevOps");
    }
}
