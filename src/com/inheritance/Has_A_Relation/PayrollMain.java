package com.inheritance.Has_A_Relation;

public class PayrollMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"jiban",40000,4000,3000);
        System.out.println("Employee tax is :"+TaxUtil.calculateTax(e1));
		System.out.println(e1);
	}

}
