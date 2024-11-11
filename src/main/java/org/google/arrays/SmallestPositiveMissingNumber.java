package org.google.arrays;

import java.util.Arrays;

public class SmallestPositiveMissingNumber {

    public static void main(String[] args){

    }

    //arr[] = {0,-10,1,3,-20}

    private static void findSmallestPositiveMissingNumber(int arr[]){

        Arrays.sort(arr);
        int count=arr[0];
        for(int i=0;i<arr.length;i++){
            if(count!=arr[i] && arr[i]>0){
                System.out.println();
            }
        }
    }
}
