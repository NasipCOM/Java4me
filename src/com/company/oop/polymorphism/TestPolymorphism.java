package com.company.oop.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        test(animal1);
        test(dog1);
        test(cat1);
    }

    static void test(Animal animal){
        animal.eat();
    }
}
//    // Upcasting восходящее преоброзвание
//    Animal animal = new Dog();
//    //or
//    Dog dog = new Dog();
//    Animal animalDog = dog;
//    // Downcasting нисходящее преоброзование
//    Dog dog2 = (Dog) animal;
