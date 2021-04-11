package com.example.thymelefetest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController                 // Thymeleaf used only Controller
public class MyController { // only GET and POST request velid

    @RequestMapping("/about")
    public String findAll(){
        return "Hello World!";
    }

//    @GetMapping(value = "/about")
//    public String getrequest(Model model){
//
//        model.addAttribute("name","Ravi Gupta");
//
//        model.addAttribute("Date",new Date().toString());
//
//        model.addAttribute("isActive",true);  // check conditional operater
//
//        model.addAttribute("age",17);
//        return "about";
//    }
}
