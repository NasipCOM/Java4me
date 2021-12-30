package com.company.oop;

public class Car {
    private String color;
    private String model;
    private int fuelInTank;
    private final int CONSUMPTION;
    protected final int PRICE;


    public Car(String color, String model, int fuelInTank, int consumption, int price){
        this.color = color;
        this.model = model;
        this.fuelInTank = fuelInTank;
        this.CONSUMPTION = consumption;
        this.PRICE = price;
    }

    public void fillTank(int liters){
        fuelInTank = fuelInTank + liters;
        System.out.println("Now you have " + fuelInTank + " of gasoline in your tank!");
    }

    public int taxForCar(){
        return (int)(PRICE * 0.01);
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getFuelInTank() {
        return fuelInTank;
    }

    public int getConsumption() {
        return CONSUMPTION;
    }
}
