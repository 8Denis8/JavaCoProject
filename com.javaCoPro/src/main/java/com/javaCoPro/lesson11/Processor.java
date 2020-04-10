package com.javaCoPro.lesson11;

public class Processor {
    private String brand;
    private String cores;
    private int frequency;

    public Processor(String brand, String cores, int frequency) {
        this.brand = brand;
        this.cores = cores;
        this.frequency = frequency;
    }

    public void printInfo() {
        System.out.println("Processor{" + " brand='" + brand + "'" + ", cores='" + cores + "'" + ", frequency='"
                + frequency + "'" + "}");
    }

}