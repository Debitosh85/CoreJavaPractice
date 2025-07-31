package com.inheritance.Has_A_Relation;

public class Customer {
	
	private String name;
	private String email;
	private Order order;
	
	public Customer(String name,String email,Order order)
	{
		this.name = name;
		this.email = email;
		this.order = new Order("101","Biryani");
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", order=" + order + "]";
	}
	
	

}
