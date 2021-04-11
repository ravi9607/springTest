package com.example.thymelefetest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Controller                 // Thymeleaf used only Controller
public class MyController { // only GET and POST request velid

    @GetMapping(value = "/about")
    public String getrequest(Model model){

//        model.addAttribute("name","Ravi Gupta");
//
//        model.addAttribute("Date",new Date().toString());
//
//        model.addAttribute("isActive",true);  // check conditional operater
//
//        model.addAttribute("age",17);
        return "about";
    }
}
