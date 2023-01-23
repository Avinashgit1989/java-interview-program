package com.interview.programs.matrix;

import java.util.Scanner;

public class PrintSecondaryDiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = scanner.nextInt();
        System.out.println("Enter the column");
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Add element to matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The secondary diagonal of matrix is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if((i+j)  ==  row-1){
                    System.out.print(matrix[i][j] + " ");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
