package com.example.geekbrainsspring.simple;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MailService {
    public void sendMail(){
        System.out.println("Письмо отправлено!");
    }
}
