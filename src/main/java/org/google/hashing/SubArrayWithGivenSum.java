package org.google.hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {

    public static void main(String[] args){

        findSubArrayWithGivenSum(new int[]{5,8,6,13,3,-1},22);
    }
    //5,8,6,13,3,-1
    private static int findSubArrayWithGivenSum(int arr[],int sum){

        HashSet<Integer> set = new HashSet<>();
       int count =0;
        int pre_sum = 0;
        for(int i=0;i<arr.length;i++){
            pre_sum += arr[i];
            if(pre_sum==sum) {
              count=count+1;
            }
            if(set.contains(pre_sum-sum) == true) {
                count=count+1;
            }else{
                set.add(pre_sum);
            }
        }

      return count;
    }
}
