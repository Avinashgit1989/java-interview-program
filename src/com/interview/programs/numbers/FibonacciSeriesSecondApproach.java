package com.interview.programs.numbers;

import java.util.Scanner;

public class FibonacciSeriesSecondApproach {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int num = new Scanner(System.in).nextInt();
        int firstNumber =0, secondNumber =1;
        System.out.println("The Fibonacci series is ");
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        do {
            int fibonacci = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonacci;
            num--;
            System.out.println(fibonacci);
        }while (num-2>0);
    }
}
