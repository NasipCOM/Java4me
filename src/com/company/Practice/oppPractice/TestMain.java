package com.company.Practice.oppPractice;

public class TestMain {
    public static void main(String[] args) {
       Dog dog1 = new Dog(1, "Baron", 40, 3, 200, true);
       Cat cat1 = new Cat(1, "Bars", 7, 5, 100, true, 20);
       Cow cow1 = new Cow(1, "Anfica", 200.80, 2, 1000, false);
       Sheep sheep1 = new Sheep(1, "Rokki", 55, 5, 150, false);

        dog1.sleep();
        System.out.println(dog1.meatPrice());

        System.out.println(cat1.meatPrice());
        cat1.eat();
        cat1.say();
        cat1.run();


        cow1.eat();
        System.out.println(cow1.meatPrice());
        cow1.sleep();
        System.out.println(cow1.speed());


        sheep1.eat();
        System.out.println(sheep1.getCOST());
        System.out.println(sheep1.meatPrice());
        sheep1.run();
    }
}
