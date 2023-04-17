package com.example.user1service.service;

import com.example.user1service.entity.Customer;
import com.example.user1service.entity.MyOrders;
import com.example.user1service.entity.Product;
import com.example.user1service.entity.Test;
import com.example.user1service.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    RestTemplate restTemplate;

    public Customer addProduct(@RequestBody Customer customer){
        return customerRepo.save(customer);
    }

    public Test myOrders(int cid){
        Optional<Customer> customer = customerRepo.findById(cid);
        int pid = customer.get().getPid();

        Product product = restTemplate.getForObject("http://localhost:8002/product/"+pid, Product.class);
        MyOrders myOrders = new MyOrders();
        myOrders.setCustomer(customer.get());
        myOrders.setProduct(product);

        Test test = new Test();
        test.setContainerTest(myOrders);
        return test;
    }

}
