package com.company.Practice.habrPractice;

public class Main {
    public static void main(String[] args) {
        Vector vec1 = new Vector(2,3,4);
        Vector vec2 = new Vector(5,6,7);

        System.out.println(vec1.scalarProduct(vec2));

        Vector result = vec2.subtract(vec1);
        System.out.println(result.sqrt());

        Vector addedRes = vec1.add(vec2);
        System.out.println(addedRes.sqrt());

        Vector crossRes = vec2.crossProduct(vec1);
        System.out.println(crossRes.sqrt());
    }
}
