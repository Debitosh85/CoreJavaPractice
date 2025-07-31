package Debitosh;

public class Sell {
	
	public static void main(String[] args) {
		
		double buyPrice=32500;
		
		
		double Profit=27/100*buyPrice;
		
		double vat=12.7/100*buyPrice;
		
		double serviceCharge=  3.84/100*buyPrice;
		
		
		double totalSellingprice= Profit+vat+serviceCharge;
		
		
		System.out.println("Totalsellingprice"+totalSellingprice);
		System.out.println("vat"+vat);
		System.out.println("Servicecharge"+serviceCharge);
		
	
		
		
		
		
	}

}
