package com.javaCoPro.lesson12;

public final class Teacher extends Person {
    private String sabject;

    public Teacher(String name, String lastName, int age, String gender, Address address, String sabject) {
        super(name, lastName, age, gender, address);
        this.sabject = sabject;
    }

    public String getSabject() {
        return this.sabject;
    }

}