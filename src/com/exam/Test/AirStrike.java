package com.exam.Test;

public class AirStrike {
	
	String name;
	String missionDetails;
	
	public AirStrike(String name,String missionDetails)
	{
		this.name = name;
		this.missionDetails =  missionDetails;
	}
	
	public AirStrike getAirstrikePlan()
	{
		System.out.println("Generating a generic airstrike plan...");
		return this;
	}
}

class PrecisionAirstrike extends AirStrike 
{
	
	public PrecisionAirstrike (String name,String missionDetails)
	{
		super(name,missionDetails);
	}
	@Override
	public PrecisionAirstrike getAirstrikePlan ()
	{
		System.out.println("Generating a precision airstrike plan...\r\n"
				+ "Targeting coordinates locked. Minimum collateral damage ensured");
		return this;
	}
}

class CarpetBombingAirstrike extends AirStrike
{
	public CarpetBombingAirstrike(String name,String missionDetails)
	{
		super(name,missionDetails);
	}
	
	@Override
	public CarpetBombingAirstrike getAirstrikePlan ()
	{
		System.out.println("Generating a carpet bombing airstrike plan...\r\n"
				+ "All coordinates in a 5km radius will be bombed for maximum impact.");
		return this;
	}
}




