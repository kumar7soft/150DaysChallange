package org.google.arrays;

public class SearchInRotatedSortedArray {

    public static void main(String[] args){

    }

    private static int searchInSortedArray(int arr[],int target){

        int rotation =-1;
        for(int i=0;i<arr.length;i++){
            if(target ==arr[i]){
                rotation=i+1;
            }
        }
        return rotation;
    }
}
