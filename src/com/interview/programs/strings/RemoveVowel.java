package com.interview.programs.strings;

import java.util.Scanner;
import java.util.function.Predicate;

public class RemoveVowel {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String str = new Scanner(System.in).nextLine();
        Predicate<Character> charPred = charVal -> charVal.equals('a') || charVal.equals('e') || charVal.equals('i') || charVal.equals('o') || charVal.equals('u');
         String strAfterRemoval ="";
        for (int i = 0; i < str.length(); i++) {
            if(!charPred.test(str.charAt(i))){
                strAfterRemoval += str.charAt(i);
            }
        }
        System.out.println("String after removal of vowel");
        System.out.println(strAfterRemoval);
    }
}
