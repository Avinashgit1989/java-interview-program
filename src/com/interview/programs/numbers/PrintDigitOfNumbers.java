package com.interview.programs.numbers;

import java.util.Scanner;
import java.util.function.Function;

public class PrintDigitOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Function<Integer, Integer> digtFun = num-> num % 10;
        while (number!=0){
            if(number>=0){
                System.out.print(digtFun.apply(number) +" ");
                number = number / 10;
            }
        }
    }
}
