package org.example.first10days;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums1));  // Output: 3

        int[] nums2 = {1, 2, 3};
        System.out.println(pivotIndex(nums2));  // Output: -1

        int[] nums3 = {2, 1, -1};
        System.out.println(pivotIndex(nums3));  // Output: 0
    }
}
