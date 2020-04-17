package com.javaCoPro.lesson12;

public class App {
    public static void main(String[] args) {
        Address ad01 = new Address();
        Person per01 = new Person("John", "Hopkins", 1950, "male", ad01);

        Address ad02 = new Address();
        Student stud01 = new Student("Samuel", "Jackson", 1960, "male", ad02, "Math", "MBA");

        Address ad03 = new Address();
        Teacher teach01 = new Teacher("Patricia", "Lee", 1980, "female", ad03, "Biology");

        GraduateStudent studGr01 = new GraduateStudent("Mike", "Wei", 1990, "male", ad01, "History", "MBA");

        System.out.println(stud01.getName());

        Pug poppy = new Pug("Poppy", "BLue");
        poppy.bark();

        Chau prince = new Chau("Prince", 50);
        prince.bark();
    }
}