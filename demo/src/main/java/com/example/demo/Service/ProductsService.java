package com.example.demo.Service;
import com.example.demo.Model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    public Product getProducts(){
        return new Product(0, "first");
    }    
}
