package com.javaCoPro.lesson10;

public class Persona {
    public String name;
    public String lastName;

    public Persona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println(name + ", " + lastName);
    }
}