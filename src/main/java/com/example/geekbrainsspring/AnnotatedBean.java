package com.example.geekbrainsspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedBean {
    @Autowired
    SimpleBean simpleBean;

    public void example(){
        simpleBean.doSomething();
    }
}
