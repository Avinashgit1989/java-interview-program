package com.interview.programs.strings;

import java.util.Scanner;

public class ReverseStringApproachSecond {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        StringBuffer strBuffer  = new StringBuffer(new Scanner(System.in).nextLine());
        System.out.println("Reverse of the String is : "+ strBuffer.reverse());
    }
}
