package com.javaCoPro.lesson12;

public abstract class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " wow-wow");
    }

}