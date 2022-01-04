package com.company.Practice.oppPractice;

public class Dog extends Animal{
    public Dog(int id, String name, double weight, int age, int COST, boolean isPredator) {
        super(id, name, weight, age, COST, isPredator);
    }

    @Override
    public void sleep() {
        System.out.println("The " + getName() + " is sleeping!" );
    }

    @Override
    public void eat() {
        System.out.println("The " + getName() + " is eating!");
    }
}
