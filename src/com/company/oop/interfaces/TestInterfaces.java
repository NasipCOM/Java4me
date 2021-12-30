package com.company.oop.interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion", 1);
        Person nasip = new Person("Nasip", 23, "male");

        lion.sayInfo();
        nasip.sayInfo();

        //Также можно создавать объекты и так но тогда будут доступны только методы из интерфейса
//        Info lion = new Animal("Lion", 1);
//        Info nasip = new Person("Nasip", 23, "male");

    }
}
