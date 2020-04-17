package com.javaCoPro.lesson12;

public class Student extends Person {
    protected String major;
    protected String program;

    public Student(String name, String lastName, int age, String gender, Address address, String major,
            String program) {
        super(name, lastName, age, gender, address);
        this.major = major;
        this.program = program;
    }

    public String getMajor() {
        return this.major;
    }

    public String getProgram() {
        return this.program;
    }

}