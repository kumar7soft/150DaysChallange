package org.revision.arrays;

import java.util.ArrayList;
import java.util.List;


public class LargeFactorial {

    public static void main(String[] args){

        System.out.println(factorial(new int[]{0, 1, 2, 3, 4},5));
    }

    public static long[] factorial(int[] a, int n) {
        // Define the modulus
        final int MOD = 1000000007;

        // Find the maximum number in the array A to determine the size of precomputation
        long maxA = 0;
        for (long num : a) {
            maxA = Math.max(maxA, num);
        }
        int max = (int)maxA;

        // Precompute factorials modulo MOD up to maxA
        long[] factorials = new long[max + 1];
        factorials[0] = 1; // 0! is 1

        for (int i = 1; i <= maxA; i++) {
            factorials[i] = (int)((long)factorials[i - 1] * i % MOD);
        }

        // Prepare the result list
        long[] result = new long[n];

        // Populate the result array using precomputed factorials
        for (int i = 0; i < n; i++) {
            result[i] = factorials[a[i]];
        }

        return result;
    }
}
