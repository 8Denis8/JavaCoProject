package com.javaCoPro.lesson11;

public class Motherboard {
    private String brand;
    private String chipset;

    public Motherboard(String brand, String chipset) {
        this.brand = brand;
        this.chipset = chipset;
    }

    public void printInfo() {
        System.out.println("Motherboard{" + " brand='" + brand + "'" + ", chipset='" + chipset + "'" + "}");
    }

}