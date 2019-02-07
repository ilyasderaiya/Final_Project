package com.lambton;

public abstract class Vehicle implements IPrintable{
    private String make;
    private String plate;

    public Vehicle(String make, String plate) {
        setMake(make);
        setPlate(plate);
    }

    public String printMyData() {
        return "\n Make : " + getMake() +
                "\nPlate : " + getPlate();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

}
