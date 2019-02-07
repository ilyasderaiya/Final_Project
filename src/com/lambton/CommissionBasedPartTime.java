package com.lambton;

public class CommissionBasedPartTime extends PartTime {
    private double commission;
    private Vehicle vehicle;

    public CommissionBasedPartTime(String firstname, String lastName, int age, String city, float rate, float hoursWorked,double commission, Vehicle vehicle) {
        super(firstname, lastName, age, city, rate, hoursWorked, vehicle);
        setCommission(commission);
        setVehicle(vehicle);
    }

    double calEarnings(){return (getRate() * getHoursWorked()) + calculateComission();}

    public double calculateComission() {
        double calculatedComission = 0;
        if (commission != 0) {
            double totalAmount = getRate() * getHoursWorked();
            calculatedComission = (getCommission() / 100) * totalAmount;
        }
        return calculatedComission;
    }

    @Override
    public String printMyData() {
        return super.printMyData() + checkTypeofVehicle() +
                "\n Employee is Part Time \\ Commission Based" +
                "\nCommission :" + getCommission() +
                "\nEarnings :" + calEarnings();
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

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        if(commission <= 0){
            this.commission = 0;
        }else{
            this.commission = commission;
        }
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
