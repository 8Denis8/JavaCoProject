package com.javaCoPro.lesson10;

public class App {
    public static void main(String[] args) {
        // Dog dog01 = new Dog();
        // Dog dog02 = new Dog("Larry", "pug", 5);
        // Dog dog03 = new Dog("Alisa");

        // dog01.age = 10;
        // dog01.breed = "Somoed";
        // dog01.name = "Laika";

        // System.out.println(dog02.name);
        // dog01.bark();
        // dog02.bark();
        // dog03.bark();

        House house01 = new House(3000, 5, 4.5, "home", new int[] { 1, 3, 3 });
        house01.printInfo();

        Boat boat = new Boat("John");
        boat.printName();
        boat.owner = "xxx";

        Boat boat1 = new Boat(50, "Beda", "Vrungel", 34567);
        boat1.printName();

        Student valya = new Student();
        valya.setName("Valya");
        valya.setLastname("Vetrova");
        valya.setYear(5000000);

        System.out.println(valya.getName());
    }
}