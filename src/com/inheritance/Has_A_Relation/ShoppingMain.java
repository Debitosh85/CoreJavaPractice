package com.inheritance.Has_A_Relation;

public class ShoppingMain {

	public static void main(String[] args) {
		
		Order Od1 = new Order("123456","Biryani");
		Customer customer = new Customer("James","James@example.com",Od1);
		System.out.println(customer);

	}

}
