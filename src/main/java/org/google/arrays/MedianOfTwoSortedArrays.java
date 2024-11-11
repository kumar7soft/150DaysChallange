package org.google.arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2)); // Output: 2.00000

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(findMedianSortedArrays(nums3, nums4)); // Output: 2.50000
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int totalLeft = (m + n + 1) / 2;

        int left = 0;
        int right = m;

        while (left < right) {
            int i = left + (right - left) / 2;
            int j = totalLeft - i;

            if (nums1[i] < nums2[j - 1]) {
                left = i + 1;
            } else {
                right = i;
            }
        }

        int i = left;
        int j = totalLeft - i;

        int nums1LeftMax = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
        int nums1RightMin = (i == m) ? Integer.MAX_VALUE : nums1[i];
        int nums2LeftMax = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
        int nums2RightMin = (j == n) ? Integer.MAX_VALUE : nums2[j];

        if ((m + n) % 2 == 1) {
            return Math.max(nums1LeftMax, nums2LeftMax);
        } else {
            return (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2.0;
        }
    }
}

