package com.oop.shallow_copy;

public class Estuffs {
	
	private String laptopName;
	private String laptopBrand;
	private double laptopPrice;
	
	
	public Estuffs(String laptopName,String laptopBrand,double laptopPrice)
	{
       this.laptopName = laptopName;
       this.laptopBrand = laptopBrand;
       this.laptopPrice = laptopPrice;
	}


	public String getLaptopName() {
		return laptopName;
	}


	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}


	public String getLaptopBrand() {
		return laptopBrand;
	}


	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}


	public double getLaptopPrice() {
		return laptopPrice;
	}


	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}


	@Override
	public String toString() {
		return "Estuffs [laptopName=" + laptopName + ", laptopBrand=" + laptopBrand + ", laptopPrice=" + laptopPrice
				+ "]";
	}
	
	
	

}
