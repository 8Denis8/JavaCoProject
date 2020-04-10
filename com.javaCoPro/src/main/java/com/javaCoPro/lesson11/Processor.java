package com.javaCoPro.lesson11;

public class Processor {
    private String brand;
    private String cores;
    private double frequency;

    public Processor(String brand, String cores, double frequency) {
        this.brand = brand;
        this.cores = cores;
        this.frequency = frequency;
    }

    public void printInfo() {
        String info = "Processor{" + " brand='" + brand + "'" + ", cores='" + cores + "'" + ", frequency='" + frequency
                + "'" + "}";
        System.out.println(info);
    }

}