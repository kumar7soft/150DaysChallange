package org.example.bitmaniculation;

import java.util.*;

public class SubsetsOfanArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            generateSubsets(arr);
            //System.out.println(); // Print a newline after each test case output
        }
        scanner.close();
    }

    public static void generateSubsets(int[] arr) {
        int n = arr.length;
        int totalSubsets = 1 << n; // Total number of subsets is 2^n

        // Generate subsets using bit manipulation
        for (int i = 0; i < totalSubsets; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the jth bit is set in the current subset
                if ((i & (1 << j)) != 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            //System.out.println();
        }
    }
}