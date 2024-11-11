package org.google.sorting;

import org.w3c.dom.ls.LSOutput;

public class BubbleSort {

    public static void main(String[] args){
        performBubleSort(new int[]{2, 1, 4, 3});

    }

    //{2, 1, 4, 3}

    private static void performBubleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }

}
