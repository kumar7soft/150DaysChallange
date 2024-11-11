package org.google.arrays;

public class MaxAndSecondMax {

    public static void main(String[] args){

        int[] arr1 = {2, 1, 2};
        largestAndSecondLargest(arr1);
    }
    public static int[] largestAndSecondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            max2 = -1;
        }

        return new int[]{max1, max2};
    }
}
