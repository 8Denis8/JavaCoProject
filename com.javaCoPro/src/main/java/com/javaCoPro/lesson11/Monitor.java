package com.javaCoPro.lesson11;

public class Monitor {
    private String brand;
    private String model;
    private int size;

    public Monitor(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public void printInfo() {
        String info = "Monitor{" + " brand='" + brand + "'" + ", model='" + model + "'" + ", size='" + size + "'" + "}";
        System.out.println(info);
    }

}