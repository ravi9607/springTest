package com.example.thymelefetest.controller;


import com.example.thymelefetest.entity.User;
import com.example.thymelefetest.service.firstService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController                 // Thymeleaf used only Controller
public class MyController { // only GET and POST request velid

    @Autowired
    private firstService firstservice;

    @RequestMapping("/about")
    public String findAll(Model model){
        model.addAttribute("name","Ravi");

        model.addAttribute("Date",new Date().toString());

        model.addAttribute("isActive",true);  // check conditional operater

        model.addAttribute("age",19);
        return "about";
    }

    @GetMapping(value = "/html")
    public String getrequest(Model model){

        model.addAttribute("name","Ravi Gupta");

        model.addAttribute("Date",new Date().toString());

        model.addAttribute("isActive",true);  // check conditional operater

        model.addAttribute("age",17);
        return "about";
    }

    @RequestMapping("/test")
    public List<User> getAll(){
        return this.firstservice.getUser();
    }
}
