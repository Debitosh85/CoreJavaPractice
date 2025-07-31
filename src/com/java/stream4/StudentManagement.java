package com.java.stream4;

import java.util.*;
public class StudentManagement {

	private static List<Student> students = new ArrayList<>();
	
	
	private static void addStudent(String name,String gender,String department,double gpa,int year_of_study) {
		
		students.add(new Student(name,gender,department,gpa,year_of_study));
		System.out.println("Student added Successfully");
		
	}
	
	private static void listAllStudents() {
		students.forEach(System.out::println);
	}
	
	private void sortStudentByGpa() {
		if(students.isEmpty()) throw new NoSuchElementException("Student List can't be empty");
		students.stream().sorted(Comparator.comparingDouble(Student::getGpa)).forEach(System.out::println);
	}
	
	private static void findTopGpaByDepartment() {
		if (Student::get Department)
	}
	
	
	
	
	public static void main(String[] args) {
		

	}

}
