package com.java.practice;

import java.util.Scanner;

class Student {
	Student s1 = null; // Instance + Reference Variable
	static Scanner sc = new Scanner(System.in); // Static + Reference Var

	public void accept(Student st) // st parameter variable
	{
		Student s2 = new Student(); // s2 local Variable
		System.out.println("Executed");
	}
}

public class ReferenceVariable {

	public static void main(String[] args) {
		Student student = new Student();
		student.accept(student);

	}

}
