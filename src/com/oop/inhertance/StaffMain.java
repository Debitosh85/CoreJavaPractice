package com.oop.inhertance;

public class StaffMain {

	public static void main(String[] args) {
		
		Proffesor pr = new Proffesor("S.mishra",234,"Biology","Dna Cutting");
		pr.displayInfo();
		pr.teachSubject();
		pr.conductResearch();
	}

}
