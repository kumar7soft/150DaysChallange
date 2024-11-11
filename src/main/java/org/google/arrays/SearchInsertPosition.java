package org.google.arrays;

public class SearchInsertPosition {

    public static void main(String[] args){

        insertElementInSortedPosition(new int[]{1,3,5,6},2);
    }

    //1,3,5,6 element = 2
    private static void insertElementInSortedPosition(int arr[],int element){

        int left =0;
        int right =arr.length-1;
        while(left <= right){
            int   mid = (left+(right-left))/2;
            if(arr[mid] == element){

            }else if(arr[mid]> element){
                right=right-1;
            }else{
                left=left+1;
            }

        }

    }
}
