package com.team.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {
    @GetMapping("/")
    public String hi(){
        return "hello";
    }

    @GetMapping("/list")
    public String list(){
        return "/movie/list";
    }
}
