package com.interview.programs.numbers;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class EvenOrOddSecond {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        IntPredicate checkEven = num->num % 2 == 0;
        System.out.println(checkEven.test(number) ? "Even" : "Odd");
    }
}
