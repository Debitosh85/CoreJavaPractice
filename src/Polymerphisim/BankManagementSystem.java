package Polymerphisim;

public class BankManagementSystem {

	public static void main(String[] args) {
		
		Account a1 = new SavingAccount("123@abc",5000,15);
		a1.generateStatement();
		
		System.out.println("------------------------------");
		
		Account a2 = new CheckingAccount("234@SDC",6000,34);
		a2.generateStatement();
		
				

	}

}
