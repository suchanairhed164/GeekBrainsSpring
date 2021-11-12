package com.example.geekbrainsspring.simple;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
    public void getProducts(){
        System.out.println("Получен список продуктов!");
    }
}
