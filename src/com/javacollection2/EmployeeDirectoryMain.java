package com.javacollection2;

public class EmployeeDirectoryMain {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Raghav","Devloper",5000);
		Employee e2 = new Employee("Subham","Manager",6000);
		Employee e3 = new Employee("Sekh","Engineer",8000);
		
		Directory d1 = new Directory();
		
		d1.addEmployee(e1);
		d1.addEmployee(e2);
		
		d1.displayAllEmployees();
		
		d1.deleteEmployee(0);
		
		Employee update = new Employee("Bob","Senior designer",7000);
		d1.updateEmployee(0, update);
		
		d1.displayAllEmployees();
		d1.addEmployee(e3);
		

	}

}
