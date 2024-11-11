package org.google.arrays;

public class FindTheMaximumSumOfKConsecutiveElement {

    public static void main(String[] args){

        maxConsecutiveSum(new int[] {1,8,30,-5,20,7},3);
    }

    //1,8,30,-5,20,7
    private static void maxConsecutiveSum(int arr[],int k){

        if (arr.length < k) {
            throw new IllegalArgumentException("Array length must be greater than or equal to k");
        }
        int max = 0;
        int currSum = 0;
        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        max = currSum;
        // Slide the window over the array
        for (int i = k; i < arr.length; i++) {
            currSum = currSum + arr[i] - arr[i - k];
            max = Math.max(max, currSum);
        }
        System.out.println(max);
    }
}
