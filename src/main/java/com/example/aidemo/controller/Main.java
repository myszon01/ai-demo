package com.example.aidemo.controller;

import com.example.aidemo.model.Greeting;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Main {

    @QueryMapping
    public Greeting hello() {
        return new Greeting("Hello, World!");
    }

    @QueryMapping
    public String hello2() {
        return "Hello, GraphQL!";
    }

}