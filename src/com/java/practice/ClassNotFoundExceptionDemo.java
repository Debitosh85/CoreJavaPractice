
package com.java.practice;

import java.util.*;

public class ClassNotFoundExceptionDemo {

  public ClassNotFoundExceptionDemo(String message) {
    Class<?> clazz;
    try {
      clazz = Class.forName(message);
      System.out.println("Class found:" + message + clazz.getName());
    } catch (ClassNotFoundException e) {
      System.out.println("Class" + message + "notfound.");
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the className:");
    String classname = sc.nextLine();
    new ClassNotFoundExceptionDemo(classname);
    sc.close();
  }

}