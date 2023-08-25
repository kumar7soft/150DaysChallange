package org.example.bitmaniculation;

import java.util.ArrayList;
import java.util.List;

public class SubsetGeneration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        generateSubsets(arr);
    }

    static void generateSubsets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> subsets = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                System.out.println(1 <<j);
                if ((i & (1 << j)) > 0) { // Check if j-th bit is set in i
                    subset.add(arr[j]);
                }
            }
            subsets.add(subset);
        }

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
