package com.interview.programs.strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String str = new Scanner(System.in).next();
        String reverseString = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseString += str.charAt(i);
        }
        System.out.println("Reverse of string is :"+ reverseString);
    }
}
