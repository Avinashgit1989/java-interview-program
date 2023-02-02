package com.interview.programs.numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print Fibonacci series");
        int number = scanner.nextInt();
        int firstNumber =0, secondNumber =1;
        System.out.println("The Fibonacci Series is ");
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        for (int i = 2; i < number; i++) {
            int fibonacci = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonacci;
            System.out.println(fibonacci);
        }
    }
}
