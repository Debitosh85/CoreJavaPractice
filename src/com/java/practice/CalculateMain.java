package com.java.practice;

import java.util.*;

public class CalculateMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square:");
        int side = sc.nextInt();
        Calculate.getSquare(side);
        sc.close();
    }
}