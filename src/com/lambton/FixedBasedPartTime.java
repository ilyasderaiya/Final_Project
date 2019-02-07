package com.lambton;

public class FixedBasedPartTime extends PartTime {

    private double fixedAmount;
    private Vehicle vehicle;

    public FixedBasedPartTime(String firstname, String lastName, int age, String city, float rate, float hoursWorked,double fixedAmount, Vehicle vehicle) {
        super(firstname, lastName, age, city, rate, hoursWorked, vehicle);
        setFixedAmount(fixedAmount);
        setVehicle(vehicle);
    }

    @Override
    public String printMyData() {
        return super.printMyData() + checkTypeofVehicle() +
                "\nEmployee is Part Time \\ Fixed Based" +
                "\nFixed Amount :" + getFixedAmount() +
                "\nEarnings :" + calcEarnings();
    }

    Double calcEarnings() {
        return (getRate() * getHoursWorked()) + getFixedAmount();
    }

    public String checkTypeofVehicle(){
        if(vehicle == null){
            System.out.println("\nEmployee has no registered vehicle");
        }
        else if(vehicle instanceof Car){
            System.out.printf(((Car) vehicle).printMyData());
        }
        else if(vehicle instanceof Motorcycle){
            System.out.printf(((Motorcycle) vehicle).printMyData());
        }
        return "a";
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
}
