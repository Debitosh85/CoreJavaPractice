package Exam;

public class OnlineShoppingSystem {

	public static void main(String[] args) {
		
		Electronics e1 = new Electronics("Electronics",20000,"Reliance");
		e1.displayInfo();
		System.out.println("The total electronics cost is"+ e1.calculateTotalcost(4));
		
		System.out.println("-----------------------");
		
		Clothing c1 = new Clothing("Clothing",3000,"L");
		c1.displayInfo();
		System.out.println("Total clothing cost is "+c1.calculateTotalcost(6));
	}

}
