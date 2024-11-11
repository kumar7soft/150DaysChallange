package org.revision.arrays;

public class MaximumSubArraySum {

    public static void main(String[] args){

        maximumSubArraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
    //-2,1,-3,4,-1,2,1,-5,4

    private static void maximumSubArraySum(int arr[]){

        int sum = arr[0];
        int maxSum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum = Math.max(arr[i]+sum,arr[i]);
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}
