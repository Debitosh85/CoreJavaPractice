package com.com.java;

public class ArraystroreExample {
    public static void storeObjects() {

        Object[] strArray = new String[5];

        try {

            strArray[0] = "java";
            strArray[1] = "java";
            strArray[2] = "@@";
            strArray[3] = "123abc";
            strArray[4] = "java";

            System.out.println("Arrays elements is " + strArray[0] + strArray[4]);

        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException Caught:" + e.getMessage());
        }

    }

    public static void main(String[] args) {
        storeObjects();
    }

}
