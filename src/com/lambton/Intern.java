package com.lambton;

public class Intern extends Employee {

    private String schoolName;
    private double earnings;
    private Vehicle vehicle;

    public Intern(String firstName, String lastName, int age, String city, String schoolName, double earnings, Vehicle vehicle){
        super(firstName, lastName, age, city);
        setSchoolName(schoolName);
        setEarnings(earnings);
        setVehicle(vehicle);
    }

    @Override
    public String printMyData() {
        return super.printMyData() + checkTypeofVehicle() +
                "\nEmployee is  Intern" +
                "\n School Name : " + getSchoolName() +
                "\n Earnings : " + getEarnings();
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
