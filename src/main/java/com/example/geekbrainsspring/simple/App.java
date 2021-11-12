package com.example.geekbrainsspring.simple;

import com.example.geekbrainsspring.AnnotatedBean;
import com.example.geekbrainsspring.AppConfig;
import com.example.geekbrainsspring.CodeCreator;
import com.example.geekbrainsspring.SimpleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ShopService shopService = context.getBean("shopService", ShopService.class);
        shopService.buy();


        ((AnnotationConfigApplicationContext) context).close();

    }
}
