package com.java.practice;

public class ArrayIndexexceptionDemo {
    public static void main(String[] args) {
        int[] arr = new int[2];

        try {
            arr[10] = 15;
            System.out.println("Value of arr[10] is: " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
