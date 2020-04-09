package com.javaCoPro.leson09;

public class App {
    public static void main(String[] args) {
        // String xx = new String();
        // int[] arr = new int[10];

        Car car01 = new Car();
        Car car02 = new Car();

        car01.brand = "Toyota";
        car01.model = "Camry";
        car01.color = "Silver";
        car01.year = 2015;
        car01.price = 15000;

        car02.brand = "Honda";
        car02.model = "Civic";
        car02.color = "Silver";
        car02.year = 2018;
        car02.price = 18000;

        System.out.println("My new car is " + car01.brand + " " + car01.model + " " + car01.year);

        Person person01 = new Person();
        Person person02 = new Person();

        person01.name = "Anna";
        person01.lastName = "Ivanova";
        person01.eyeColor = "Blue";
        person01.height = 102;
        person01.year = 2015;

        person02.name = "Boris";
        person02.lastName = "Petrov";
        person02.year = 2015;
        person02.height = 110;
        person02.eyeColor = "Brown";

        Fruit fruit01 = new Fruit();

        fruit01.name = "Apple";
        fruit01.color = "Green";

        Dog dog01 = new Dog();
        Dog dog02 = new Dog();

        dog01.name = "Sharik";
        dog01.age = 2;
        dog01.breed = "Dvorterier";

        dog02.name = "Lord";
        dog02.age = 3;
        dog02.breed = "Dog";

        if (dog01.age > dog02.age) {
            System.out.println(dog01.name + " is older");
        } else {
            System.out.println(dog02.name + " is older");
        }

        dog01.bark();
        dog02.bark();
        dog01.sleep();

        car01.printInfo();
        person01.printInfo();

    }

}