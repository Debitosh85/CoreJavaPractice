package com.java.map;

import java.util.Arrays;
import java.util.List;

public class HosptitalManagement {
	private static int s=100;
	private  int hospitalCode;
	private String hospitalName;
	private List<String>listOfTreatments;
	private String contactPerson;
	private String contactNumber;
	private String location;
	
	public HosptitalManagement(String hospitalName,
			String contactPerson,String contactNumber,String location)
	{
	     this.hospitalCode=++s;
		this.hospitalName = hospitalName;
		this.listOfTreatments =  Arrays.asList("Cardiac", "ENT","Ortho", "Pediatric", "Gastro");
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}

	public  int getHospitalCode() {
		return this.hospitalCode;
	}

	

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}

	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "HosptitalManagement [hospitalName=" + hospitalName + ", listOfTreatments=" + listOfTreatments
				+ ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber + ", location=" + location
				+ "]";
	}
	
	
	


}


	