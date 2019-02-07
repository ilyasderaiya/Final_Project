package com.lambton;

public abstract class Employee implements IPrintable{

    private String fisrtName;
    private String lastName;
    private int age;
    private String city;
    private Vehicle vehicle;

    public Employee(String firstName, String lastName, int age, String city, Vehicle vehicle){
        setFisrtName(firstName);
        setLastName(lastName);
        setAge(age);
        setCity(city);
        setVehicle(vehicle);
    }

    public Employee(String firstName, String lastName, int age, String city){
        setFisrtName(firstName);
        setLastName(lastName);
        setAge(age);
        setCity(city);
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int calBirthYear()
    {
       int By = ( 2018 - getAge() );
        return By;
    }

    @Override
    public String printMyData() {
        return  "\nFirst Name : " + getFisrtName() +
                "\n" + "Last Name : " + getLastName() +
                "\n" + "Year of Birth : " + calBirthYear() +
                "\n City : " + getCity();

    }
}
