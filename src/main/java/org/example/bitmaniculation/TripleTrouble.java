package org.example.bitmaniculation;

import java.util.Scanner;

public class TripleTrouble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Size of the array
            int[] arr = new int[N];

            // Input the elements of the array
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Find and print the unique element
            int uniqueElement = findUniqueElement(arr);
            System.out.println(uniqueElement);
        }

        sc.close();
    }

    private static int findUniqueElement(int[] arr) {
        int ones = 0, twos = 0;
        for (int num : arr) {
            // Update 'twos' with common elements between 'ones' and the current element
            twos |= (ones & num);
            // Update 'ones' with the current element
            ones ^= num;
            // The common elements between 'ones' and 'twos' are set to 0 in 'ones'
            int common_mask = ~(ones & twos);
            ones &= common_mask;
            twos &= common_mask;
        }
        return ones;
    }
}