package com.example.demo.Web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import com.example.demo.Service.ProductsService;
import com.example.demo.Model.Product;

import io.micrometer.core.ipc.http.HttpSender.Response;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductsController {
    private final ProductsService productsService;

    //You can also use @Autowired
    public ProductsController(ProductsService productsService){
        this.productsService = productsService;
    }

    @GetMapping(value="/products")
    public Product get(){
        return productsService.getProducts();
    }
}
