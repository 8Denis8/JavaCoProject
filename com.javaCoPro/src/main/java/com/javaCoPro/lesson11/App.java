package com.javaCoPro.lesson11;

public class App {
    public static void main(String[] args) {

        Name andrew = new Name("Andrew", "Dowson");
        Person ad = new Person(andrew, homeAddress);
        String ln = ad.getName().getLastName();
        System.out.println(ln);

        // Addres homeAddres = new Addres("158 Broadway", "New York", 10016, "NY");
        // Person person01 = new Person("Andrew", "Dowson", homeAddres);

        // person01.getAddres().printAddress();

        // Vihecles car01 = new Vihecles();

        // Farm farm01 = new Farm(homeAddres, car01, person01);

        // Addres studAddress = new Addres("154 Baden Pl", "Brooklyn", 23598, "NY");
        // Student stud01 = new Student("Maria", "Shi", studAddress, 154154154, "Math");

        Mous mous = new Mous("Logitech");
        // mous.printInfo();

        Keyboard kb01 = new Keyboard("Microsoft");
        // kb01.printInfo();

        Monitor monitor = new Monitor("Samsung", "LC49RG90SSNXZA", 49);
        // monitor.printInfo();

        Processor proc01 = new Processor("Intel", "14 Core i9-10940X", 4.8);
        // proc01.printInfo();

        Motherboard mamka01 = new Motherboard("ASUS", "Intel X299 EATX");
        // mamka01.printInfo();

        SysBlock sysBlock = new SysBlock(proc01, mamka01);
        // sysBlock.printInfo();

        Computer dell = new Computer(monitor, sysBlock, mous, kb01);
        dell.printInfo();
    }
}