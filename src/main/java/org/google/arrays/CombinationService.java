package org.google.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationService {

    public static void main(String[] args){

        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println(new CombinationService().combinationSum(candidates1, target1));  // Output: [[2, 2, 3], [7]]

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    //{2, 3, 6, 7};
    private void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            currentCombination.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
