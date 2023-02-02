package com.interview.programs.numbers;

import java.util.Scanner;

public class FibonacciSeriesThirdApproach {
    public static void main(String[] args) {
        System.out.println("Enter the number to print Fibonacci");
        int number = new Scanner(System.in).nextInt();
        int firstNumber=0, secondNumber=1;
        System.out.println("The fibonacci series is");
        System.out.println(firstNumber+"\n"+secondNumber);
        switch (1){
            case  1:
                for (int i = 2; i <number ; i++) {
                    int fibonacci = firstNumber + secondNumber;
                    firstNumber = secondNumber;
                    secondNumber = fibonacci;
                    System.out.println(fibonacci);
                }
                break;
        }
    }
}
