package com.javaCoPro.Types;

public class Plane {
    public String name;

    public String getInfo() {
        return name;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getInfo() + "'" + "}";
    }

}