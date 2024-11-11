package org.google.arrays;

public class MaximumProductSubArray {

    public static void main(String[] args){

        System.out.println( maxProduct(new int[]{6, -3, -10, 0, 2},5));
    }

    //{6, -3, -10, 0, 2}
    public static long maxProduct(int[] arr, int n) {
        if (n == 0) return 0;

        // Variables to store the maximum and minimum product ending at the current element
        long maxEndingHere = arr[0];
        long minEndingHere = arr[0];

        // Variable to store the maximum product found so far
        long maxSoFar = arr[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < n; i++) {
            // Store the current maximum product in case it gets modified later
            long temp = maxEndingHere;

            // Update the maximum product ending at the current element
            maxEndingHere = Math.max(arr[i], Math.max(maxEndingHere * arr[i], minEndingHere * arr[i]));

            // Update the minimum product ending at the current element
            minEndingHere = Math.min(arr[i], Math.min(temp * arr[i], minEndingHere * arr[i]));

            // Update the maximum product found so far
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
