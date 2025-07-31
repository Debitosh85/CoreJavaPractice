package com.java.collection4;


	import java.util.ArrayList;
	import java.util.Collections;
	
	import java.util.List;
	public class EmployeeSorter {
	    public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("john", 55000));
	        employees.add(new Employee("Alice", 50000));
	        employees.add(new Employee("Bob", 55000));
	        employees.add(new Employee("Charlie", 45000));

	        System.out.println("Before sorting:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }

	        Collections.sort(employees, new EmployeeComparator());

	        System.out.println("\nAfter sorting:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }
	}


