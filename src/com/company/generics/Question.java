package com.company.generics;

public class Question<T extends Number> {
    T num;

    public Question(T num) {
        this.num = num;
    }

    boolean absEqual(Question<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
        }
    }
