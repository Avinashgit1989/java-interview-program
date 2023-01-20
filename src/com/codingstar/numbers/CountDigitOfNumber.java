package com.codingstar.numbers;

import java.util.Scanner;
import java.util.function.Function;

public class CountDigitOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int number = new Scanner(System.in).nextInt();

        Function<Integer, Integer> numFun = num ->{
            int count =0;
            while (num !=0){
                count = count + 1;
                num = num / 10;
            }
            return count;
        };
        System.out.println("The count of digit of given number is "+ numFun.apply(number));
    }
}
