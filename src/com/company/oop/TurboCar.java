package com.company.oop;

public class TurboCar extends Car {
    int turboSpeed;

    public TurboCar(String color, String model, int fuelInTank, int CONSUMPTION, int turboSpeed, int PRICE) {
        super(color, model, fuelInTank, CONSUMPTION, PRICE);

        this.turboSpeed = turboSpeed;
    }

    //Polymorphism
        @Override
        public int taxForCar(){
            return (int)(PRICE * 0.03);

    }
}


