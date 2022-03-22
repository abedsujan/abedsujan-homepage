package com.abedsujan.abedsujanhomepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("greetings")
public class SimpleController {

    @GetMapping("/{name}")
    public @ResponseBody String hello(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}