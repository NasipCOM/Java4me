package com.company.oop;

public class TestOop {
    public static void main(String[] args) {
        Car honda = new Car("red", "Honda", 20, 12, 20000);
        honda.fillTank(20);
        System.out.println(honda.taxForCar());

        TurboCar lexus = new TurboCar("red", "LX470", 150, 24, 250,20000);
        System.out.println(lexus.taxForCar());
    }
}
