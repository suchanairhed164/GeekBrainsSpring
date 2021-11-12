package com.example.geekbrainsspring;

public class ShapesClassNameGenerator implements ClassNameGenerator{
    @Override
    public String generateClassName() {
        String[] names = {"Square", "Circle", "Ellipse", "Triangle"};
        return names[(int) (Math.random()*4)];
    }
}
