package com.company.Practice.oppPractice;

public class Cat extends Animal{

    private int tailLength;

    public Cat(int id, String name, double weight, int age, int COST, boolean isPredator, int tailLength) {
        super(id, name, weight, age, COST, isPredator);
        this.tailLength = tailLength;
    }

    @Override
    public void sleep() {
        System.out.println("The cat " + this.getName() + " is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("The cat " + getName() + " is eating");
    }

    public void say(){
        System.out.println("meow");
    }

}
