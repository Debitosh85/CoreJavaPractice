package com.java.collectioninterface;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		
		        CabCustomerService service = new CabCustomerService();

		        // Adding customers
		        CabCustomer customer1 = new CabCustomer(1, "John", "Location A", "Location B", 3, "1234567890");
		        CabCustomer customer2 = new CabCustomer(2, "Smith", "Location C", "Location D", 6, "0987654321");
		        CabCustomer customer3 = new CabCustomer(3, "Alice", "Location E", "Location F", 5, "1234567890"); // Existing customer

		        service.addCabCustomer(customer1);
		        service.addCabCustomer(customer2);

		        // Checking if customer1 is the first customer
		        boolean isFirstCustomer1 = service.isFirstCustomer(customer1);
		        System.out.println("Is John the first customer? " + isFirstCustomer1);

		        // Checking if customer3 is the first customer
		        boolean isFirstCustomer3 = service.isFirstCustomer(customer3);
		        System.out.println("Is Alice the first customer? " + isFirstCustomer3);

		        // Printing bills
		        service.printBill(customer1);
		        service.printBill(customer2);
		        service.printBill(customer3);
		    }
		
		    }
	


