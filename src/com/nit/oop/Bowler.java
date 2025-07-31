package com.nit.oop;

public class Bowler {
	
	private String name;
	private int wickets;
	private int matches;
	private int ballsBowled;
	private int runsConceded;
	
	
	public void bowlerDetails(String name,int wickets,int matches,int ballsBowled,int runsConceded)
	{
		this.name = name;
		this.wickets = wickets;
		this.matches = matches;
		this.ballsBowled =  ballsBowled;
		this.runsConceded = runsConceded;
		
		computeBowlingAverage();
		
	}
	
	public void computeBowlingAverage()
	{
		if (runsConceded > 0 || ballsBowled >0  && matches==0)
		{
			System.err.println("Error");
		}
		
		else
		{
			double average =  runsConceded / wickets;
			System.out.println(" Bowler name is :"+ name + "Bowling avg ="+average);	
		}
	}
	
	public void computeStrikeRate()
	{
		if (runsConceded >0 || ballsBowled >0 && matches==0)
		{
			System.err.println("Error");
		}
		
		else 
		{
			double strikerate = runsConceded / ballsBowled;
			System.out.println("Bowler name is :"+ name +"Strikerate = "+ strikerate);
		}
	}
	
	public void showStatistics ()
	{
		System.out.println("Bowler Name: "+this.name);
		System.out.println("Wickets :" +this.wickets);
		System.out.println("Matches :"+ this.matches);
		System.out.println("Ballsbowled:"+this.ballsBowled);
		System.out.println("RunsConceded:"+this.runsConceded);
	}
	
	

}
