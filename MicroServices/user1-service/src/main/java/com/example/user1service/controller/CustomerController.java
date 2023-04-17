package com.example.customerservice.controller;


import com.example.customerservice.entity.Customer;
import com.example.customerservice.entity.MyOrders;
import com.example.customerservice.entity.Test;
import com.example.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addProduct(customer);
    }

    @GetMapping("/myorders/{id}")
    public Test getMyOrder(@PathVariable("id") int id){
        return customerService.myOrders(id);
    }
}
