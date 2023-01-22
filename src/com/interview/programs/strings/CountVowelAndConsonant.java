package com.interview.programs.strings;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class CountVowelAndConsonant {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String str = new Scanner(System.in).nextLine();
        String regex = "[aeiouAEIOU]";
        int vowelCount=0 , consonantCount=0;
        Predicate<Character> checkVowelPred = vowel -> Pattern.compile(regex).matcher(vowel.toString()).find();
        Predicate<Character> checkSpace = space->space.equals(' ');
        for (int i = 0; i < str.length(); i++) {
            if(!checkSpace.test(str.charAt(i))){
                if(checkVowelPred.test(str.charAt(i))){
                    vowelCount = vowelCount + 1;
                }else{
                    consonantCount = consonantCount + 1;
                }
            }
        }
        System.out.println("The count of vowel is : "+vowelCount+"\nThe count of Consonant is :"+consonantCount);
    }
}
