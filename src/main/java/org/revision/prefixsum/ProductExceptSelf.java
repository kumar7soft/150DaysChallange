package org.revision.prefixsum;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args){

        productExceptSelfs(new long[]{10, 3, 5, 6, 2});
    }

    public static long[] productExceptSelfs(long[] arr) {
        int n = arr.length;
        long[] left = new long[n];
        long[] right = new long[n];
        long[] product = new long[n];

        // Initialize left array
        left[0] = 1;  // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        // Initialize right array
        right[n - 1] = 1;  // No elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        // Calculate product array
        for (int i = 0; i < n; i++) {
            product[i] = left[i] * right[i];
        }

        return product;
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
