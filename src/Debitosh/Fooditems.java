package Debitosh;

public class Fooditems {

	public static void main(String[] args) {
		
		int Chickenrollprice=60;
		int quantityofroll= Integer.parseInt(args[0]);
		
		int totalbill=quantityofroll*Chickenrollprice;
		
		int vegetablepuffsprice=25;
		int qtyofpuffs= Integer.parseInt(args[1]);
		
		int totalamount=qtyofpuffs*vegetablepuffsprice;
		
		
		int ovreallbillofitems=totalbill+totalamount;
		
		double discount=ovreallbillofitems-50;
		
		System.out.println("Totaldiscount="+ discount );	
		
		

	}

}
