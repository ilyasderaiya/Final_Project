package com.lambton;

public class FullTime extends Employee {

    private double salary;
    private double bonus;
    private Vehicle vehicle;

    public FullTime(String firstName, String lastName, int age, String city, double salary, double bonus, Vehicle vehicle) {
        super(firstName, lastName, age, city, vehicle);
        setBonus(bonus);
        setSalary(salary);
        setVehicle(vehicle);
    }
    public String printMyData() {
        return super.printMyData() + checkTypeofVehicle() +
                "\nEmployee is  Full-Time" +
                "\n Salary : " + getSalary() +
                "\n Bonus : " + getBonus() +
                "\n Earnings : " + calcEarnings() + "\n";

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

    Double calcEarnings() {
        return getSalary()+getBonus();
    }

    private double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        if (salary<0){
            this.salary=0;
        }else {
            this.salary = salary;
        }
    }

    private double getBonus() {
        return bonus;
    }

    private void setBonus(double bonus) {
        if (bonus<0){
            this.bonus=0;
        }else {
            this.bonus = bonus;
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}
