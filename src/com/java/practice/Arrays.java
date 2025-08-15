package com.java.practice;

import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        java.util.Arrays.sort(arr);
        for (int num : arr) {
            System.err.println(num);
        }

    }

    public static List<String> asList(String string, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }
}