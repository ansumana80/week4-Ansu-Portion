package com.example.week4challenge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/content")
    public String infoPage(){
        return "content";
    }


}