package com.java.practice;

import java.util.Scanner;

public class AreaCalculator {

    public static double calculateArea(double length, double breadth) {

        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException();
        }

        else {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangel:");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth of the rectangle:");
        double breadth = sc.nextDouble();

        try {
            double area = calculateArea(length, breadth);
            System.out.println("Area of the rectangle is: " + area);
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException caught: Dimensions must be positive: length is" + length
                    + "breadth is" + breadth);
        }
        sc.close();
    }

}
