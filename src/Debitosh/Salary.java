package Debitosh;

public class Salary {

	public static void main(String[] args) {
		
		double basicSalary =Double.parseDouble(args[0]);
		
		double hra=basicSalary*0.15;
		
		double conveyanceAllowance=basicSalary*0.15;
		
		double eAllowance=basicSalary*0.10;
		
		double totalSalary= basicSalary + hra + conveyanceAllowance + eAllowance;
		
		
		System.out.println("basicSalary"+basicSalary);
		System.out.println("hra"+hra);
		System.out.println("conveyanceAllowance"+conveyanceAllowance);
		System.out.println("eAllowance"+eAllowance);
		System.out.println("totalSalary"+totalSalary);
		
	}
	
}
		
		
		
		
		