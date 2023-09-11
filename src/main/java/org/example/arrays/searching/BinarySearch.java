package org.example.arrays.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){

        binarySearch(new int[] {10,3,12,-5,8,15,-4,1},-40);
    }

    //10,3,12,-5,8,15,-4,1

    private static  void binarySearch(int arr[],int k){

        Arrays.sort(arr);
        int start=0;
        int end =arr.length-1;
        boolean isPresent =false;
        while(start<=end){
           int mid=start+end/2;
            if(arr[mid] == k){
                isPresent=true;
                System.out.println("Element present in the array");
                break;
            }else if(arr[mid] >k){

                end=mid-1;
                //end=end-1;
            }else{
                //start=start-1;
                start=mid+1;
            }
        }
        if(!isPresent)
            System.out.println("Element is not available in the list");
    }
}
