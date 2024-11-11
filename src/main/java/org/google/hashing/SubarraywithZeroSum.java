package org.google.hashing;

import java.util.HashSet;

public class SubarraywithZeroSum {
    public static void main(String[] args){

        subArrayWithZeroSum(new int[]{5, 3, 9, -4, -6, 7, -1});
        subArrayWithZeroSum1(new int[]{1,4,13,-3,-10,5});
    }
    //int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};

    private static void  subArrayWithZeroSum1(int arr[]){
        int prefixSum = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            if(set.contains(prefixSum)){
                System.out.println("Identified Zero sub array sum");
            }else{
                set.add(prefixSum);
            }
        }
    }

    private static void subArrayWithZeroSum(int arr[]){

        int prefixSum = 0;
        boolean falg=false;

        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i=0;i<arr.length;i++){
            prefixSum =prefixSum+arr[i];
            if(set.contains(prefixSum)){
                falg = true;
                System.out.println("SubArray with given sum is identified");
            }else{
                set.add(prefixSum);
            }
        }

        if(!falg)
        System.out.println("Not Found");
    }
}
