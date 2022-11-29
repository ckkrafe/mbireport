package com.mbireport.mbireport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping("/create")
    public String create(){return "create";}

    @GetMapping("/search")
    public String search(){return "search";}

    @GetMapping("/searchresult")
    public String searchresult(){

        return "searchresult";
    }
}
