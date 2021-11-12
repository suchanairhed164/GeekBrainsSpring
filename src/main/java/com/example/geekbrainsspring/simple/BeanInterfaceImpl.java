package com.example.geekbrainsspring.simple;

import org.springframework.stereotype.Component;

@Component
public class BeanInterfaceImpl implements BeanInterface{

    @Override
    public void doSomething() {
        System.out.println(1);
    }
}
