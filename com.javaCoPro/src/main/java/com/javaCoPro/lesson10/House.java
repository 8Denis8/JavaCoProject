package com.javaCoPro.lesson10;

public class House {
    public int square;
    public int bedroom;
    public double bathroom;
    public String type;
    private int[] bulbs;

    public House(int sq, int br, double bt, String t, int[] bulbs) {
        square = sq;
        bedroom = br;
        bathroom = bt;
        type = t;
        this.bulbs = bulbs;
    }

    public void printInfo() {
        System.out.println(square + ", " + bedroom + ", " + bathroom + ", " + type + ", " + bulbs.length);
    }
}