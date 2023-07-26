package org.example.first10days;

public class MergeSortedArrays {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int i = m - 1; // Index of last element in nums1
        int j = n - 1; // Index of last element in nums2
        int k = m + n - 1; // Index of last element in merged array

        // Merge elements from the end of both arrays until one of the arrays is exhausted
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                merged[k] = nums1[i];
                i--;
            } else {
                merged[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy any remaining elements from nums1, if any
        while (i >= 0) {
            merged[k] = nums1[i];
            i--;
            k--;
        }

        // Copy any remaining elements from nums2, if any
        while (j >= 0) {
            merged[k] = nums2[j];
            j--;
            k--;
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0}; // Sorted array with extra space for merging
        int[] nums2 = {2, 4, 6};
        int m = 3; // Number of elements in nums1 (excluding the extra space)
        int n = 3; // Number of elements in nums2

        int[] merged = merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : merged) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 4 5 6
    }
}

