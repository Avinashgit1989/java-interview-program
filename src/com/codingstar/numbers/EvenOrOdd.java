package com.codingstar.numbers;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 2 ==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
