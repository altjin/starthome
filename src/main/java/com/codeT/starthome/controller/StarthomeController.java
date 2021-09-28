package com.codeT.starthome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StarthomeController {

    @GetMapping
    public String index(){
        return "index";
    }
}
