package com.java.collectioninterface;

import java.util.ArrayList;

import java.util.List;

public class CabCustomerService {
   
    private List<CabCustomer> cabCustomers;

   
    public CabCustomerService() {
        cabCustomers = new ArrayList<>();
    }

   
    public void addCabCustomer(CabCustomer customer) {
        cabCustomers.add(customer);
        System.out.println("Customer added: " + customer);
    }

    
    public boolean isFirstCustomer(CabCustomer customer) {
        for (CabCustomer existingCustomer : cabCustomers) {
            if (existingCustomer.getPhone().equals(customer.getPhone())) {
                return false;
            }
        }
        return true;
    }

    
    public double calculateBill(CabCustomer customer) {
        if (isFirstCustomer(customer)) {
            return 0.0;
        } else {
            int distance = customer.getDistance();
            if (distance <= 4) {
                return 80.0;
            } else {
                return 80.0 + 6.0 * distance;
            }
        }
    }

    
    public void printBill(CabCustomer customer) {
        double bill = calculateBill(customer);
        System.out.println(customer.getCustomerName() + " Please pay your bill of Rs." + bill);
    }
}