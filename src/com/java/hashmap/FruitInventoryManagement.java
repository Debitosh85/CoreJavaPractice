package com.java.hashmap;
import java.util.HashMap;
import java.util.Scanner;

public class FruitInventoryManagement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, Integer> fruit = new HashMap<>();
        fruit.put("Apple", 50);
        fruit.put("Banana", 30);
        fruit.put("Orange", 20);
        
        System.out.println(fruit);
        System.out.println("Total number of entries: " + fruit.size());
        
        System.out.println("The HashMap is empty: " + fruit.isEmpty());
        
        System.out.println("Quantity of Apple: " + fruit.get("Apple"));
        System.out.println("Quantity of Banana: " + fruit.get("Banana"));
        
        System.out.println("Enter fruit name:");
        String fruits = sc.nextLine();
        
        if (fruit.containsKey(fruits)) {
            System.out.println("Specific fruit exists in the HashMap: " + fruits);
        } else {
            System.out.println("Specific fruit does not exist");
        }
       System.out.println("Enter Quantity:");
       Integer qty = sc.nextInt();
       
        if(fruit.containsValue(qty))
        {
        	System.out.println("Specific fruit quantity exist in the hasmap:"+qty);
        }else {
       	System.out.println("Specific quantity doesn't exist");
        } 
        sc.close();
    }
}