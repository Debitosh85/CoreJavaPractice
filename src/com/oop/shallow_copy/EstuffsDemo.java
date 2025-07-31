package com.oop.shallow_copy;

public class EstuffsDemo {

	public static void main(String[] args) {
		
		Estuffs Electri = new Estuffs("HP","Durban",60000);
		
		Estuffs Electri2 = Electri;
		
		Electri2.setLaptopBrand("German");
		Electri2.setLaptopName("Lenovo");
		Electri2.setLaptopPrice(70000);
		
		
		
		
		System.out.println(Electri2);
		System.out.println(Electri);

	}

}
