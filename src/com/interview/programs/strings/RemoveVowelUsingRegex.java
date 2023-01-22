package com.interview.programs.strings;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class RemoveVowelUsingRegex {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String str = new Scanner(System.in).nextLine();
        String regex = "[aeiouAEIOU]";
         String strAfterRemoval ="";
        for (int i = 0; i < str.length(); i++) {
            if(! Pattern.compile(regex).matcher(String.valueOf(str.charAt(i))).find()){
                strAfterRemoval += str.charAt(i);
            }
        }
        System.out.println("String after removal of vowel");
        System.out.println(strAfterRemoval);
    }
}
