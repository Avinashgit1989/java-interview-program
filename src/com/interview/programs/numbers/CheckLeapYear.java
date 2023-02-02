package com.interview.programs.numbers;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class CheckLeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
       int yearVal =  new Scanner(System.in).nextInt();
       IntPredicate yearPred = year-> year % 400 ==0  || (year % 4 ==0 && year % 100 !=0);
        System.out.println(yearPred.test(yearVal)? "Leap Year" : "not a leap Year");
    }
}
