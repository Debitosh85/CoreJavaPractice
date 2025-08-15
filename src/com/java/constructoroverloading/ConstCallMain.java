package com.java.constructoroverloading;

class ConstCall {

    public ConstCall(int x, int y) {
        System.out.println("Sum of" + x + "and" + y + "is:" + (x + y));

    }

    public ConstCall(int x) {
        this(100, 200);

        System.out.println("Square of the:" + x + "is" + (x * x));
    }

}

public class ConstCallMain {
    public static void main(String[] args) {

        ConstCall c = new ConstCall(5);
    }
}