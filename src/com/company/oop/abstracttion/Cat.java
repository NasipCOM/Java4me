package com.company.oop.abstracttion;

public class Cat extends Animal{

    public Cat(String name, int id) {
        super(name, id);
    }
    @Override
    public void eating(){
        System.out.println("The cat is eating!");
    }

    public void makeSound(){
        System.out.println("meow");
    }
}
