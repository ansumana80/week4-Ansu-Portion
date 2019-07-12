package com.example.week4challenge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/about")
    public String infoPage(){
        return "about";
    }
    @RequestMapping("/information")
    public String info(){
        return "about";
    }

    @RequestMapping("/author")
    public String author(){
        return "author";
    }

    @RequestMapping("/author_information")
    public String author_information(){
        return "author_information";
    }
}