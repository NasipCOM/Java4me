package com.company.generics;

public class NumericFunc<T extends Number> {
    T ob;

    public NumericFunc(T ob) {
        this.ob = ob;
    }
    public int square(){
        return ob.intValue() * ob.intValue() ;
    }
}
