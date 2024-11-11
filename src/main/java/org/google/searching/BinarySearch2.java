package org.google.searching;

public class BinarySearch2 {

    public static void main(String[] args){

    }

    //{ 12, 34, 10, 6, 40 }

    private static void performBinarySearch(int arr[], int n){
        int start =0;
        int end = arr.length-1;

        while(start < end){
            int mid = start+ end /2 ;

            if( arr[mid] == n ){
                System.out.println("Found at"+mid);
            }else if( arr[mid] > n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
    }
}
