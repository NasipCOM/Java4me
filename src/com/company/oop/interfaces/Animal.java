package com.company.oop.interfaces;

public class Animal implements Info{
    private String name;
    private int id;

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void sleep(){
        System.out.println("I'm sleeeping!");
    }

    public void sayInfo(){
        System.out.println("It is " + name + " and its id is " + id);
    }
}
