package com.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HospitalService {
    private List<HosptitalManagement> hospitals = new ArrayList<>();
    
    
    public int addHospitals(HosptitalManagement h) {
    	hospitals.add(h);
    	return h.getHospitalCode();
    }
    
    public HashMap<Integer, String> getDetails(){
    	HashMap<Integer, String> hm= new HashMap<>();
    	for(HosptitalManagement m:hospitals) {
    		hm.putIfAbsent(m.getHospitalCode(), m.getHospitalName());
    	}
    	return hm;
    }
    public HosptitalManagement getDetailsWithCode(int hCode) {
    	for(HosptitalManagement h:hospitals) {
    		if(h.getHospitalCode()==hCode) {
    			return h;
    		}
    	}
    	return null;
    }

    
}

