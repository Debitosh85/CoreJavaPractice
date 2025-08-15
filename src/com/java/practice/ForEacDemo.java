package com.java.practice;

public class ForEacDemo {
    public static void main(String[] args) {
        Object[] arr = { 1, 90.90, "java", 'A', new String("Java") };
        java.util.Arrays.sort(arr);

        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
}