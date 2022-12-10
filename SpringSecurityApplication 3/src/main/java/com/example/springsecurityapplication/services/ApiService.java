package com.example.springsecurityapplication.services;

import com.example.springsecurityapplication.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ApiService {

private ProductRepository productRepository;
    private ProductService productService;

    @Autowired
    public void ApiController(ProductRepository productRepository, ProductService productService) {
        this.productRepository = productRepository;
        this.productService = productService;
    }


    public ApiService(ProductRepository productRepository, ProductService productService) {
        this.productRepository = productRepository;
        this.productService = productService;
    }
}
