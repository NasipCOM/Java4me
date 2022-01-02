package com.company.generics;

public class TestGenerics {
    public static void main(String[] args) {
        MyClass<Integer, Double> obj = new MyClass<>(1, 12.0);
        MyClass<Double, String> obj1 = new MyClass<>(233.0, "get");

        obj.print();
        obj1.print();

        ///
        NumericFunc<Integer> iOb = new NumericFunc<>(5);
        System.out.println(iOb.square());

        ///
        Question<Integer> num1 = new Question<>(5);
        Question<Double> num2 = new Question<>(-5.0);

        System.out.println(num1.absEqual(num2));

        Practice<Double> hello = new Practice<>(55.5);
        System.out.println(hello.calculate());

    }
}
