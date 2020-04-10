package com.javaCoPro.lesson11;

public class Computer {
    private Monitor monitor;
    private SysBlock sysBlock;
    private Mous mous;
    private Keyboard keyboard;

    public Computer(Monitor monitor, SysBlock sysBlock, Mous mous, Keyboard keyboard) {
        this.monitor = monitor;
        this.sysBlock = sysBlock;
        this.mous = mous;
        this.keyboard = keyboard;
    }

    public void printInfo() {
        monitor.printInfo();
        keyboard.printInfo();
        mous.printInfo();
        sysBlock.printInfo();

    }
}