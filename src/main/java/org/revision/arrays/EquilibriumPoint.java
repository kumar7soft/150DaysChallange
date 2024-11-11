package org.revision.arrays;

public class EquilibriumPoint {

    public static void main(String[] args){
        findEquilibriumPoint(new int[] {1,3,5,2,2});
    }
    //1, 3, 5, 2, 2
    private static int findEquilibriumPoint(int arr[]){
        if (arr.length == 1) {
            return 1; // 1-based index, single element is equilibrium point
        }

        long totalSum = 0;
        for (long num : arr) {
            totalSum += num;
        }

        long leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // now totalSum is the right sum

            if (leftSum == totalSum) {
                return i + 1; // return 1-based index
            }

            leftSum += arr[i];
        }

        return -1;
    }
}
