package com.java.collection4;

import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        
        int salaryComparison = Double.compare(e2.getSalary(), e1.getSalary());
        if (salaryComparison != 0) {
            return salaryComparison;
        }
       
        return e2.getName().compareTo(e1.getName());
    }
}

