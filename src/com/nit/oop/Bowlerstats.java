package com.nit.oop;

public class Bowlerstats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bowler Stats = new Bowler();
		
		Stats.bowlerDetails("Virat", 10, 5, 463, 768);
		Stats.computeStrikeRate();
		Stats.showStatistics();

	}

}
