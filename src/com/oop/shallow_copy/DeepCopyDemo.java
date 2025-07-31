package com.oop.shallow_copy;



public class DeepCopyDemo {

    public static void main(String[] args) {
        
        DeepCopy stuffs = new DeepCopy(222, "laptop");
        
        DeepCopy stuffs2 = new DeepCopy();
        
        stuffs2.setProductid(stuffs.getProductid());  // Corrected line
        stuffs2.setProductname(stuffs.getProductname());
        
        System.out.println("Before Modification");
        System.out.println(stuffs);
        System.out.println(stuffs2);
        
        System.out.println("After Modication");
        
        stuffs.setProductid(333);
        stuffs.setProductname("Camera");
        
        
        
       
        
    }


	}


