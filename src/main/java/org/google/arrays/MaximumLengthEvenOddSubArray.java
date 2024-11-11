package org.google.arrays;

public class MaximumLengthEvenOddSubArray {

    public static void main(String[] args){

        findMaxLengthEvenOddSubArray(new int[] {5,10,20,6,3,8});

    }

    //10,12,14,7,8
    private static void findMaxLengthEvenOddSubArray(int arr[]){

        boolean isEven = false;
        boolean isOdd = false;
        int count=0;
        int maxCount =0;

        int curr = 1;
        int res =  1;

        for(int i=1;i<arr.length;i++){

            if((arr[i]%2 == 0 && arr[i-1]%2 != 0) || (arr[i]%2 !=0 && arr[i-1] % 2 == 0)){
                curr=curr+1;
                res = Math.max(curr,res);
            }else{
                curr=1;
            }
        }
        System.out.println(res);
    }
}
