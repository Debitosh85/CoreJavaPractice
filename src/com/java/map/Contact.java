package com.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Contact {

	public static void main(String[] args) {
		
		Map<String,Long> addressBook = new HashMap<>();
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("List of Contacts displayed here:");
			System.out.println("1. Add Contact");
			System.out.println("2.Remove Contact");
			System.out.println("3.Exit");
			
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Contact's name:");
				String name = sc.nextLine();
				System.out.println("Enter Contact Phone no:");
				Long pHno = sc.nextLong();
				addressBook .put(name, pHno);
				addressBook .put(name, pHno);
				System.out.println("The Contact has been added");
			    System.out.println("Contact List:");
			    for (Map.Entry<String, Long> entry : addressBook.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
				break;
				
			case 2 :
				if(addressBook.size()>0)
				{
					System.out.println("Enter the Contacts name for Removal:");
					String rName = sc.nextLine();
					if(addressBook.containsKey(rName)) {
						addressBook.remove(rName);
						System.out.println("Contact Removed Sucessfully........");
						for (Map.Entry<String, Long> entry : addressBook.entrySet()) {
		                    System.out.println(entry.getKey() + " : " + entry.getValue());
		                }
					}
					else {
						System.out.println("Contact name not Found.....");
					}
				}
				else {
					addressBook.isEmpty();
					System.out.println("AddressBook is Completely Empty.....");
				}
				break;
				
			case 3:
				System.out.println("Exsiting AdressBook.....GoodBye");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice Plaese Choose a valid Option...");
		}	
	}
  }
}
