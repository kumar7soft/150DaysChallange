package org.google.important;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args){

        twoSumArray(new int[]{2,7,11,15},9);
    }

    private static int[] twoSumArray(int arr[], int k){

        HashSet<Integer> set = new HashSet<>();
        int res[] = new int[2];
        for(int i=0;i<arr.length;i++){
            if(set.contains(k-arr[i])){
                res[0] = k-arr[i];
                res[1] = arr[i];
            }else{
                set.add(arr[i]);
            }
        }
        return res;
    }
}
