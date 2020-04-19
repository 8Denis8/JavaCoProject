package com.javaCoPro.lesson13;

public class ArmDeskLampWithClamp extends DeskLight {
    private int numberOfArms;

    public ArmDeskLampWithClamp(int price, String brand, String model, int numberOfArms) {
        super(price, brand, model);
        this.numberOfArms = numberOfArms;
    }

    public int getNumberOfArms() {
        return this.numberOfArms;
    }

    public void setNumberOfArms(int numberOfArms) {
        this.numberOfArms = numberOfArms;
    }

    @Override
    public String toString() {
        return "{" + " numberOfArms='" + getNumberOfArms() + "'" + "}";
    }

}