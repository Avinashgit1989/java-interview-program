package com.interview.programs.strings;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String str = new Scanner(System.in).next();
        String reverseStr ="";
        BiPredicate<String, String> checkPred = (strVal, reverseval)-> strVal.equalsIgnoreCase(reverseval);
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println(checkPred.test(str,reverseStr)? "Palindrome": "Not Palindrome");
    }
}
