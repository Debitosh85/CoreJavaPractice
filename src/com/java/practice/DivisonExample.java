package com.java.practice;

import java.util.*;

class DivisonExample {

    public static int performDivison(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // DivisonExample d1 = new DivisonExample();
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        try {
            int result = (performDivison(a, b));
            System.out.println("Result of divison is :" + result);
        }

        catch (ArithmeticException e) {
            System.out.println(
                    "Exception caught:Divison by Zero is not possible" + "" + "dividend" + "=" + a + "" + "divisor"
                            + "=" + b);
        }
        sc.close();
    }

}
