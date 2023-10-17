package org.example.sorting;

public class InsertionSort {

    public static void main(String[] args){

        doInsertionSort(new int[]{12, 11, 13, 5, 6});
    }

    //12, 11, 13, 5, 6
    private static void doInsertionSort(int arr[]){

        for(int i=1;i<arr.length;i++){
            int j=i-1;
            while(arr[i]>arr[j]){
                int temp =arr[j];
                arr[j] =arr[i];
                arr[i] =temp;
            }

        }

    }
}
