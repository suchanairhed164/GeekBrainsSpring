package com.example.geekbrainsspring;

public class AnimalsClassNameGenerator implements ClassNameGenerator{
    @Override
    public String generateClassName() {
        String[] names = {"Cat", "Dog", "Horse", "Bull"};
        return names[(int) (Math.random()*4)];
    }
}
