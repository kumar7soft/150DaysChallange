package org.example.tree;

import java.util.TreeSet;

public class CeilingOnLeftSideInAnArray {

    public static void findCeilingLeftSide(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Handle empty or null array
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] leftCeilings = new int[arr.length];

        // Initialize the first element's ceiling as -1 since there's no element on the left
        leftCeilings[0] = -1;
        treeSet.add(arr[0]); // Add the first element to the TreeSet

        // Iterate over the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Find the ceiling of arr[i] in the TreeSet
            Integer ceiling = treeSet.ceiling(arr[i]);

            // If there is a ceiling, use it, otherwise use -1
            leftCeilings[i] = (ceiling != null) ? ceiling : -1;

            // Add the current element to the TreeSet for future queries
            treeSet.add(arr[i]);
        }

        // Print the result
        for (int i = 0; i < leftCeilings.length; i++) {
            System.out.print(leftCeilings[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 30, 15, 25, 12};
        findCeilingLeftSide(arr); // Function call to find and print the ceiling on the left side
    }
}

