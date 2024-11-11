package org.google.sorting;

public class SelectionSort {

    public static void main(String[] args){

    }

    //[64, 25, 12, 22, 11]
    private static void performSelectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int min = i;

            for(int j=0;j<arr.length;j++){

                if(arr[j] < arr[i]){
                    min = j;
                }
            }
            int temp = arr[i];
             arr[i] = arr[min];
             arr[min] = temp;
        }

    }
}
