package org.google.arrays;

import java.util.Collections;
import java.util.*;
import java.util.stream.Collectors;


public class SortArrayByIncreasingFrequency {

    public static int[] frequencySort(int[] nums) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert the array to a list of Integers to use custom sorting
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        // Step 3: Sort the list with a custom comparator
        list.sort((a, b) -> {
            int frequencyCompare = frequencyMap.get(a).compareTo(frequencyMap.get(b));
            if (frequencyCompare == 0) {
                return b.compareTo(a); // if frequencies are the same, sort by value in decreasing order
            }
            return frequencyCompare;
        });

        // Step 4: Convert the list back to an array and return
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(frequencySort(nums1))); // Output: [3, 1, 1, 2, 2, 2]

        // Example 2
        int[] nums2 = {2, 3, 1, 3, 2};
        System.out.println(Arrays.toString(frequencySort(nums2))); // Output: [1, 3, 3, 2, 2]

        // Example 3
        int[] nums3 = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        System.out.println(Arrays.toString(frequencySort(nums3))); // Output: [5, -1, 4, 4, -6, -6, 1, 1, 1]
    }
}
