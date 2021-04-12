package com.example.thymelefetest.service;

import com.example.thymelefetest.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class firstService {

    List<User> user;

    public firstService(){
        user =new ArrayList<>();
        user.add(new User(1,"Ravi","987665"));
        user.add(new User(2,"rahul","123456"));
        user.add(new User(2,"rohit","543665"));

    }
    public List<User> getUser(){
        return user;
    }
}
