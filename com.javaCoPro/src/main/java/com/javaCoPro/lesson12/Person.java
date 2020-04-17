package com.javaCoPro.lesson12;

public class Person {
    protected String name;
    protected String lastName;
    protected int age;
    protected String gender;
    protected Address address;

    public Person(String name, String lastName, int age, String gender, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public Address getAddress() {
        return this.address;
    }

}