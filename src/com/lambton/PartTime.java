package com.lambton;

public abstract class PartTime extends Employee {

    private float rate;
    private float hoursWorked;
    private Vehicle vehicle;

    public PartTime(String firstname,String lastName, int age, String city, float rate, float hoursWorked, Vehicle vehicle) {
        super(firstname, lastName, age, city, vehicle);
        setRate(rate);
        setHoursWorked(hoursWorked);
        setVehicle(vehicle);
    }

    @Override
    public String printMyData() {
        return super.printMyData() +
                "Hours Worked :" + getHoursWorked() +
                "\n" + "Rate :" + getRate();
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        if (rate > 0.0) {
            this.rate = rate;
        } else {
            this.rate=0;
        }

    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        if(hoursWorked<0){
            this.hoursWorked=0;
        }else {
            this.hoursWorked = hoursWorked;
        }

    }
}
