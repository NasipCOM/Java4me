package com.company.Practice.incapsulation;

public class Main {
    public static void main(String[] args) {
        Library lib1 = new Library("Alex",1, "Flower for Eldjernon", "Spitalhofstrasse", "Passau");
        System.out.println(lib1.getAddress());
        System.out.println(lib1.getBooksName());
        System.out.println(lib1.getName());
        lib1.setBooksName("Harry Poter");
        System.out.println(lib1.getBooksName());
    }
}
