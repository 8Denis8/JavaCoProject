package com.javaCoPro.lesson11;

public class Person {
    private Name name;
    private Addres address;

    public Person(Name name, Addres address) {
        this.name = name;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Addres getAddress() {
        return address;
    }

}