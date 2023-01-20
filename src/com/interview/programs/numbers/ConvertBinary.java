package com.interview.programs.numbers;

import java.util.Scanner;

public class ConvertBinary {
    public static void main(String[] args) {
        System.out.println("Enetr the number");
        int number = new Scanner(System.in).nextInt();
        int temp = number;
        int[] arr = new int[10];
        int i =0;
        while (number != 0){
            arr[i] = number % 2;
            number = number / 2;
             i++;
        }
        System.out.println("The binary of number "+temp+" is ");
        for (int j = i-1; j >=0 ; j--) {
            System.out.print(arr[j]);
        }
    }
}
