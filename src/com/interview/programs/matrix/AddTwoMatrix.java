package com.interview.programs.matrix;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = scanner.nextInt();
        System.out.println("Enter the columns");
        int columns = scanner.nextInt();
        int[][] firstMatrix = new int[row][columns];
        int[][] secondMatrix = new int[row][columns];
        int[][] sunOfMatrix = new int[row][columns];

        System.out.println("Enter the element in first matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the element in second matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                sunOfMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        int count =3;
        while (count> 0){
            if (count==3){
                System.out.println("The first matrix is ");
            }else if (count == 2){
                System.out.println("The second matrix is ");
            }else if (count == 1){
                System.out.println("The sum of matrix is ");
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < columns; j++) {
                    if (count==3){
                        System.out.print(firstMatrix[i][j]+" ");
                    }else if (count == 2){
                        System.out.print(secondMatrix[i][j]+ " ");
                    }else if (count == 1){
                        System.out.print(sunOfMatrix[i][j]+ " ");
                    }
                }
                System.out.println();
            }
            count--;
        }


    }
}
