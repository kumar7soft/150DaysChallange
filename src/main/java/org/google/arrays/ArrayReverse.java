package org.google.arrays;

public class ArrayReverse {

    public static void main(String[] args){

        int arr[] ={4, 5, 1, 2};
        reverseTheArray(arr);
        printArray(arr);
    }
    //4, 5, 1, 2

    private static void reverseTheArray(int arr[]){

        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp=arr[start];
             arr[start]=arr[end];
             arr[end] = temp;
             start=start+1;
             end=end-1;
        }
    }

    private static void printArray(int arr[]){
        for(int x : arr){
            System.out.print(x+" :");
        }
    }
}
