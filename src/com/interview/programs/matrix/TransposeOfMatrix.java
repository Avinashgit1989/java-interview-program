package com.interview.programs.matrix;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = scanner.nextInt();
        System.out.println("Enter the column");
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        int[][] transponseMatrix = new int[column][row];
        System.out.println("Add element to the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transponseMatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose of given matrix is ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transponseMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
