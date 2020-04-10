package com.javaCoPro.lesson11;

public class SysBlock {
    private Processor proc;
    private Motherboard mamka;

    public SysBlock(Processor proc, Motherboard mamka) {
        this.proc = proc;
        this.mamka = mamka;
    }

    public void printInfo() {
        proc.printInfo();
        mamka.printInfo();
    }

}