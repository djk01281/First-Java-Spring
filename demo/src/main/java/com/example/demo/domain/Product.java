package com.example.demo.domain;

public class Product {
    private int id;
    private String name;

    public Product(){

    }
    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public void SetId(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void SetName(String name){
        this.name = name;
    }
}
