package com.java.constructoroverloading;

public class OverloadedConstr {

    int x;
    String y;

    public OverloadedConstr() {

        this(10);
        System.out.println("No arg Constructor");

    }

    public OverloadedConstr(int x) {

        this(x, "Hello Java");
        System.out.println("1 arg Constructor");

    }

    public OverloadedConstr(int x, String y) {

        this.x = x;
        this.y = y;
        System.out.println("2 args Constructor");

    }

    @Override
    public String toString() {
        return "OverloadedConstr[x=" + x + ",y=" + y + "]";
    }

}
