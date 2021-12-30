package com.company.oop.interfaces;

public class Person implements Info{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void work(){
        System.out.println("I'm working!");
    }

    @Override
    public void sayInfo(){
        System.out.println("My name is " + name + " and I'm " + age + " years old!");
    }
}
