package com.psps.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","/index.html","/home/index","/home"})
    public String index(){
        return "index";
    }
}
