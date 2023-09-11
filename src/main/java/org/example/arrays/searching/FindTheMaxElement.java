package org.example.arrays.searching;

import java.util.Arrays;

public class FindTheMaxElement {

    public  static void main(String[] args){

        findTheMaxElementUsingLinerSeach(new int[] {12,21,15,-3,10,-8,5,29,18},-4);
    }

    //12,21,15,-3,10,-8,5,29,18
    //-8,-3,5,10,12,15,18,21,29
    //11

    private static void findTheMaxElemenetUsingBinarySearch(int arr[],int k){

    }
    private  static void findTheMaxElementUsingLinerSeach(int arr[],int k){
        Arrays.sort(arr);
        int smallestIndex =0;
        int maxDiff =k-arr[0];
        for(int i=0;i<arr.length;i++){
            int currentDiff =k-arr[i];
            if(arr[i]<k &&currentDiff<maxDiff){
                smallestIndex=i;
                maxDiff=currentDiff;
            }
        }
        System.out.println(arr[smallestIndex]);
    }
}
