package com.example.demo.service;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Product;

@Service
public class ProductsService {
    public Product getProducts(){
        return new Product(0, "first");
    }    
}
