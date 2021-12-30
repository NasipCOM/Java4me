package com.company.generics;

public class MyClass <T, V>{
    private T ob;
    private V ob2;

    public MyClass(T ob, V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }
    public void print(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
}
