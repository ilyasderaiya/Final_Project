package com.lambton;

public class Motorcycle extends Vehicle {

    private String model;
    private String color;

    public Motorcycle(String make, String plate, String model, String color) {
        super(make, plate);
        setModel(model);
        setColor(color);
    }

    @Override
    public String printMyData() {
        return "\n Employee has a MotorCycle" +
                super.printMyData() +
                "\n model : " + getModel() +
                "\n Color : " + getColor();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
