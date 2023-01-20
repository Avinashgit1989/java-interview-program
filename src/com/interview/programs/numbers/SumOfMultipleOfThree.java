package com.interview.programs.numbers;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class SumOfMultipleOfThree {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Function<Integer, Integer> numFun = num->num % 10;
        Predicate<Integer> numPred = num -> num ==3 || num ==6 || num ==9;
        int sumOfmultipleOfThree = 0;
        while (number != 0){
            if(numPred.test(numFun.apply(number))){
                sumOfmultipleOfThree += numFun.apply(number);
            }
            number = number / 10;
        }
        System.out.println("The of multiple of three is : "+ sumOfmultipleOfThree);
    }
}
