package com.lambton;

public class Car extends Vehicle {

    private String  Model;
    private int numberOfSeats;

    public Car(String make, String plate, String model, int numberOfSeats) {
        super(make, plate);
        setModel(model);
        setNumberOfSeats(numberOfSeats);
    }

    @Override
    public String printMyData() {
        return "\n Employee has a Car" +
                super.printMyData() +
                "\nModel : " + getModel() +
                "\nNo. of Seats : " + getNumberOfSeats();
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
