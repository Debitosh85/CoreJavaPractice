package com.java.map;

public class HospitalFinder {

	public static void main(String[] args) {

        HosptitalManagement h= new HosptitalManagement("Yasoda", "Sr", "gjas", "nhg");
        HosptitalManagement h1= new HosptitalManagement("My care", "Sr", "gjas", "nhg");
        HospitalService hs=new HospitalService();
        hs.addHospitals(h);
        hs.addHospitals(h1);
        
        System.out.println(hs.getDetails());
        System.out.println(hs.getDetailsWithCode(101));
        

	}

}
