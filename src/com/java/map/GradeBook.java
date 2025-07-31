package com.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) {
		
		Map <String,String> gradebook = new HashMap<>();
		
		
		while(true) {
			System.out.println("Options");
			System.out.println("1.Add Student Grade");
			System.out.println("2. Remove Student Grade");
			System.out.println("3. Exit");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the name of Student");
				String name = sc.nextLine();
				System.out.println("Enter the Grade of Student");
				String grade = sc.nextLine();
				gradebook.put(name,grade);
				System.out.println("Student info addded successfully");
				break;
				
			case 2:
				if(gradebook.size()>0)
				{
					System.out.println("Enter the name of the Student");
					String rname = sc.nextLine();
					
					if(gradebook.containsKey(rname))
					{
						gradebook.remove(rname);
						System.out.println("Student removed Successfully");
						System.out.println("Student not found");
					}
				}
				else {
					gradebook.isEmpty();
					System.out.println("Gradebook Is Empty");
				}
				break;
				
			case 3:
				System.out.println("Thank you.........");
				System.exit(0);
				
			default:
				System.out.println("Please Enter A Valid Choice");
			sc.close();
		}
	
	}
	
}
}


