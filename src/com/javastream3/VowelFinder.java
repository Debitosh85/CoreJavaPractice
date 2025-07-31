package com.javastream3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class VowelFinder {

    public static void main(String[] args) {
        List<String> li = Arrays.asList("Rohit", "Gill", "euresh", "akash", "oman");

        Predicate<String> pr = word -> word.length() > 5 && isVowel(word.charAt(0));

        List<String> li2 = li.stream()
                             .filter(pr)
                             .collect(Collectors.toList());

        System.out.println("Filtered Names: " + li2);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
