package com.company.oop.abstracttion;

public abstract class Animal {
    private String name;
    private int id;

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void eating(){
        System.out.println("The animal is eating!");
    }
    public abstract void makeSound();
}
