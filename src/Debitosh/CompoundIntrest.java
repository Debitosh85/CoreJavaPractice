package Debitosh;

public class CompoundIntrest {

	public static void main(String[] args) {
		
		int Principle = Integer.parseInt(args[0]);
		
		float rate= Float.parseFloat(args[1]);
		
		int time=3;
		
		double totalamount=Principle*Math.pow((1+rate/100),time);
		
		double compoundintrest=  totalamount - Principle ;
		
		System.out.println(" The Compound intrest for 3 years: "+compoundintrest);
		System.out.println("total amount for 3 years:"+totalamount);
		
		
	}

}
