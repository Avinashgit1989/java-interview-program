package com.interview.programs.strings;

import java.util.Scanner;
import java.util.function.Predicate;

public class RemoveVowelSecondApproach {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String str = new Scanner(System.in).nextLine();
        Predicate<String> charPred = charVal -> charVal.equalsIgnoreCase("a") || charVal.equalsIgnoreCase("e") || charVal.equalsIgnoreCase("i") || charVal.equalsIgnoreCase("o") || charVal.equalsIgnoreCase("u");
         String strAfterRemoval ="";
        for (int i = 0; i < str.length(); i++) {
            if(!charPred.test(String.valueOf(str.charAt(i)))){
                strAfterRemoval += str.charAt(i);
            }
        }
        System.out.println("String after removal of vowel");
        System.out.println(strAfterRemoval);
    }
}
