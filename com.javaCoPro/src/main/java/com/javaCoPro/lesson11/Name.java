package com.javaCoPro.lesson11;

public class Name {
    private String name;
    private String lastName;

    public Name() {
    }

    public Name(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Name name(String name) {
        this.name = name;
        return this;
    }

    public Name lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", lastName='" + getLastName() + "'" + "}";
    }

}