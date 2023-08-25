package org.example.arrays;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Size of the matrix
            int[][] matrix = new int[N][N];

            // Read the matrix elements
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Calculate and print the sum of elements of all diagonals for the current test case
            int[] diagonalsSum = sumOfDiagonals(matrix);
            for (int sum : diagonalsSum) {
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static int[] sumOfDiagonals(int[][] matrix) {
        int N = matrix.length;
        int[] diagonalsSum = new int[2 * N - 1];

        // Calculate the sum of elements in the diagonals starting from the top-left corner
        for (int d = 0; d < N; d++) {
            int diagonalSum = 0;
            for (int i = 0; i < N - d; i++) {
                diagonalSum += matrix[i][i + d];
            }
            diagonalsSum[d] = diagonalSum;
        }

        // Calculate the sum of elements in the diagonals starting from the top-right corner
        for (int d = 1; d < N; d++) {
            int diagonalSum = 0;
            for (int i = d; i < N; i++) {
                diagonalSum += matrix[i][N - 1 - (d - 1)];
            }
            diagonalsSum[N + d - 1] = diagonalSum;
        }

        return diagonalsSum;
    }
}

