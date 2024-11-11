package org.google.arrays;

public class MaximumSumOfSubArray {


    public static void main(String[] args) {
        int[] arr = {25,-3, 8, -2, 4, -5, 6};
        int n = 6;

        int res = maxSum(arr, n);
        System.out.println(res);
    }

    public static int maxSum(int[] arr, int n) {
        int maxEnding = arr[0];
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }


}
