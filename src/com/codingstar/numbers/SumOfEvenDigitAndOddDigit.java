package com.codingstar.numbers;

import java.util.Scanner;

public class SumOfEvenDigitAndOddDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumofEvenDigit=0, sumOfOddDigit=0;
        while (number != 0){
            int digit = number % 10;
            if(digit % 2 == 0){
                sumofEvenDigit += digit;
            }else {
                sumOfOddDigit += digit;
            }
            number = number / 10;

        }
        System.out.println("Sum of the even digit of number is :"+ sumofEvenDigit);
        System.out.println("Sum of the odd digit of number is :"+ sumOfOddDigit);
    }
}
