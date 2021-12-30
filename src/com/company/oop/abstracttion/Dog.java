package com.company.oop.abstracttion;

public class Dog extends Animal{
    public Dog(String name, int id) {
        super(name, id);
    }
    public void makeSound(){
        System.out.println("bark");
    }
}
