package com.javaCoPro.lesson11;

public class Person {
    private String name;
    private String lastName;
    private Addres addres;

    public Person() {
    }

    public Person(String name, String lastName) {
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

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    // if (o == this)
    // return true;
    // if (!(o instanceof Person)) {
    // return false;
    // }
    // Person person = (Person) o;
    // return Objects.equals(name, person.name) && Objects.equals(lastName,
    // person.lastName);
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hash(name, lastName);
    // }

    // @Override
    // public String toString() {
    // return "{" +
    // " name='" + getName() + "'" +
    // ", lastName='" + getLastName() + "'" +
    // "}";
    // }

}