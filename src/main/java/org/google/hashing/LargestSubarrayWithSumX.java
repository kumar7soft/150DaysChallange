package org.google.hashing;

import java.util.HashMap;

public class LargestSubarrayWithSumX {

    public static void main(String[] args){

    }

    static int largestSubarrayWithSumX(int[] arr, int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k)
                maxLen = i + 1;
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }

        return maxLen;
    }
}
