package com.company.generics;

public class Practice<T extends Number> {
    private T num;

    public Practice(T num) {
        this.num = num;
    }

    public int calculate(){
        return num.intValue() * 5;
    }
}
