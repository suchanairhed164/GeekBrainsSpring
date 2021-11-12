package com.example.geekbrainsspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.geekbrainsspring")
public class AppConfig {
    @Bean(name = "javaCodeCreator")
    public CodeCreator javaCodeCreator(){
        JavaCodeCreator codeCreator = new JavaCodeCreator();
        codeCreator.setClassNameGenerator(animalsClassNameGenerator());
        return codeCreator;
    }

    @Bean
    public ClassNameGenerator animalsClassNameGenerator(){
        ClassNameGenerator classNameGenerator = new AnimalsClassNameGenerator();
        return classNameGenerator;
    }

    @Bean
    public SimpleBean simpleBean(){
        SimpleBean simpleBean = new SimpleBean();
        return simpleBean;
    }
}
