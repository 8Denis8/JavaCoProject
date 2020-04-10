package com.javaCoPro.lesson11;

public class App {
    public static void main(String[] args) {
        // Addres homeAddres = new Addres("158 Broadway", "New York", 10016, "NY");
        // Person person01 = new Person("Andrew", "Dowson", homeAddres);

        // person01.getAddres().printAddress();

        // Vihecles car01 = new Vihecles();

        // Farm farm01 = new Farm(homeAddres, car01, person01);

        // Addres studAddress = new Addres("154 Baden Pl", "Brooklyn", 23598, "NY");
        // Student stud01 = new Student("Maria", "Shi", studAddress, 154154154, "Math");

        Mous mous = new Mous("Logitech");
        mous.printInfo();

        Keyboard kb01 = new Keyboard("Microsoft");
        kb01.printInfo();

        Monitor monitor = new Monitor("Samsung", "u49f4k240", 49);
        monitor.printInfo();

        SysBlock sysBlock = new SysBlock();

        Computer dell = new Computer(monitor, sysBlock, mous, kb01);
        dell.printInfo();
    }
}