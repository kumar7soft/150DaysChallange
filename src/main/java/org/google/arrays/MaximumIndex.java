package org.google.arrays;

public class MaximumIndex {

    public static void main(String[] args){

    }

    //{34, 8, 10, 3, 2, 80, 30, 33, 1}
    static int maxIndexDiff(int arr[], int n) {

        if (n <= 1) return 0;

        // Create arrays for minimum and maximum values
        int[] LeftMin = new int[n];
        int[] RightMax = new int[n];

        // Fill LeftMin from left to right
        LeftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            LeftMin[i] = Math.min(arr[i], LeftMin[i - 1]);
        }

        // Fill RightMax from right to left
        RightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            RightMax[j] = Math.max(arr[j], RightMax[j + 1]);
        }

        // Find the maximum index difference
        int i = 0, j = 0, maxDiff = -1;
        while (j < n && i < n) {
            if (LeftMin[i] < RightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;

    }
}
