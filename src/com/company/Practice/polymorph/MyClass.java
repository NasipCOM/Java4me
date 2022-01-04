package com.company.Practice.polymorph;

import java.util.function.DoublePredicate;

public class MyClass {

    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass myClass1 = new MyClass();

        System.out.println(myClass.add(1, 3));
        System.out.println(myClass1.add(3.5, 5.2));

        Dog dog1 = new Dog();
        System.out.println(dog1.eat());
        System.out.println(dog1.bark());

    }
}
