package org.google.arrays;

public class TwoSumArray {

    public static void main(String[] args){

        twoSumArray(new int[]{2,7,11,15,7},4,9);
    }

    private static void twoSumArray(int arr[],int n,int x){

        int start =0;
        int end = n-1;

        while(start < end){
            int sum = arr[start]+arr[end];

            if(sum == x ){
                System.out.println("Two number sum identified"+ start+","+end);
                break;
            }else if( sum < x){
                start++;
            }else{
                end--;
            }
        }

    }
}
