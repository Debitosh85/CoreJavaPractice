package com.java.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
   
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        
        List<Integer> primeNumbers = Arrays.stream(numbers)
                                           .filter(n->isPrime(n))
                                           .collect(Collectors.toList());

      
        System.out.println("Prime Numbers: " + primeNumbers);
    }
}