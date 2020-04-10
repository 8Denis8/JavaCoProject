package com.javaCoPro.lesson11;

public class App {
    public static void main(String[] args) {
        Addres homeAddres = new Addres("158 Broadway", "New York", 10016, "NY");
        Person person01 = new Person("Andrew", "Dowson", homeAddres);

        person01.getAddres().printAddress();

        Vihecles car01 = new Vihecles();

        Farm farm01 = new Farm(homeAddres, car01, person01);

    }
}