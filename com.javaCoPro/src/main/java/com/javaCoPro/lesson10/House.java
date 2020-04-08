package com.javaCoPro.lesson10;

public class House {
    public int square;
    public int bedroom;
    public double bathroom;
    public String type;

    public House(int sq, int br, double bt, String t) {
        square = sq;
        bedroom = br;
        bathroom = bt;
        type = t;
    }

    public void printInfo() {
        System.out.println(square + ", " + bedroom + ", " + bathroom + ", " + type);
    }
}