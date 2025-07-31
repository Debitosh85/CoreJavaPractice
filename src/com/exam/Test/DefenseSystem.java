package com.exam.Test;

public class DefenseSystem {
	
	public static void main(String[] args) {
		
		AirStrike a1 = new AirStrike("Garud","Destroying bunker");
		a1.getAirstrikePlan();
		
		AirStrike a2 = new PrecisionAirstrike("Agni","precision airstrike plan...");
		a2.getAirstrikePlan();
		
		
		
	}

}
