package com.company.Practice.oppPractice;

public abstract class Animal {

    private int id;
    private String name;
    private double weight;
    private int age;
    private final int COST ;
    private final boolean isPredator;


    public Animal(int id, String name, double weight, int age, int COST, boolean isPredator) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.COST = COST;
        this.isPredator = isPredator;
    }

    public abstract void sleep();
    public abstract void eat();
    public void run(){
        System.out.println(name + " is running");
    }
    public double meatPrice(){
        if(isPredator) {
            System.out.println("Not eatable meat!");
            return 0;
        }
        return weight * COST;
    }

    public int speed(){
        return (int)(Math.random() * weight) + 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }
    //можно ли в сеттере прописать функцию чтобы вычислять
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCOST() {
        return COST;
    }
    public boolean isPredator() {
        return isPredator;
    }
}

