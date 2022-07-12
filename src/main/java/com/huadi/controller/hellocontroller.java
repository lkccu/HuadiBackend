package com.huadi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class hellocontroller {

    @RequestMapping("/hello")
    public String handle01 () {
         return "Hello, Spring boot 2!";
    }
}
