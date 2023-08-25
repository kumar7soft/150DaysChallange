package org.example.arrays;

import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Size of the matrix
            int[][] matrix = new int[n][n];

            // Input the matrix elements
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrix[j][k] = sc.nextInt();
                }
            }

            // Print the matrix in a spiral order
            printSpiral(matrix);
            System.out.println(); // Newline after each test case
        }

        sc.close();
    }

    // Function to print the matrix in a spiral order
    private static void printSpiral(int[][] matrix) {
        int topRow = 0, bottomRow = matrix.length - 1;
        int leftCol = 0, rightCol = matrix[0].length - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Print the top row from left to right
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;

            // Print the rightmost column from top to bottom
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;

            // Print the bottom row from right to left
            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }

            // Print the leftmost column from bottom to top
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol] + " ");
                }
                leftCol++;
            }
        }
    }
}
