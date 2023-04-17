package com.example.productservice.controller;

import com.example.productservice.entity.Product;
import com.example.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<Product> getProduct(){
        return productService.getProduct();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable("id") int id){
        return productService.getProductById(id);
    }

    @PostMapping("/")
    public Product addProducts(@RequestBody Product product){
        return productService.addProduct(product);
    }
}
