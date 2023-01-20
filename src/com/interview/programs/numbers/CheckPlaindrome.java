package com.interview.programs.numbers;

import java.util.Scanner;

public class CheckPlaindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int number  = new Scanner(System.in).nextInt(), reverseNumber =0;
        int temp = number;
        while (number != 0){
            reverseNumber = reverseNumber * 10 + (number % 10);
            number = number / 10;
        }
        System.out.println((temp == reverseNumber) ? "Palindrome" : "Not palindrome");
    }
}
