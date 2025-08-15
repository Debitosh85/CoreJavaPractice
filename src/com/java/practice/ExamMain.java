package com.java.practice;

import java.util.*;

public class ExamMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        int side = sc.nextInt();

        int value = Exam.add(side);
        System.out.println("Area of" + side + "is " + value);
        sc.close();
    }
}
