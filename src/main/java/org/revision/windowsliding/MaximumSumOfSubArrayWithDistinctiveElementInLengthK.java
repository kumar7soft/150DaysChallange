package org.revision.windowsliding;

import java.util.HashSet;

// Leet code problem Number : 2461
public class MaximumSumOfSubArrayWithDistinctiveElementInLengthK {

    public static void main(String[] args){

        System.out.println(findMaxSumSubArray(new int[]{1,1,1,7,8,9},3));
    }
    //1,5,4,2,9,9,9
    private static long findMaxSumSubArray(int arr[],int k){

        HashSet<Integer> set = new HashSet<>();
        long sum=0;
        long maxSum=0;
        for(int i=0;i<=arr.length-k;i++){
            for(int j=i;j<k+i;j++){
                if(!set.contains(arr[j])){
                    sum = sum +arr[j];
                    set.add(arr[j]);
                }else{
                    sum=0;
                    set.clear();
                    break;
                }
            }
            set.clear();
            maxSum=Math.max(sum,maxSum);
            sum=0;
        }
        return maxSum;

    }
}
