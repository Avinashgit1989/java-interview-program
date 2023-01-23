package com.interview.programs.matrix;

import java.util.Scanner;

public class PrintRightDiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = scanner.nextInt();
        System.out.println("Enter the number of column");
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Add element to matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix of with "+row+" row and "+column+" column");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The diagonal of matrix is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
               if(i == j){
                   System.out.print(matrix[i][j]+" ");
               }else {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
