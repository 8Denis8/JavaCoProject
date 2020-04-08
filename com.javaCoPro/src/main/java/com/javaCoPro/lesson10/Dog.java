package com.javaCoPro.lesson10;

public class Dog {
    public String name;
    public String breed;
    public int age;

    public Dog(String n, String b, int a) {
        name = n;
        breed = b;
        age = a;
    }

    public Dog(String n) {
        name = n;
    }

    public Dog() {
    }

    public void bark() {
        System.out.println(name + " wow wow");
    }
}