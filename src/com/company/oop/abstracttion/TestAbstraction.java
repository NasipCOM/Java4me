package com.company.oop.abstracttion;

public class TestAbstraction {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog", 1);
        Cat cat1 = new Cat("Cat", 2);

        dog1.eating();
        cat1.eating();
    }

}
