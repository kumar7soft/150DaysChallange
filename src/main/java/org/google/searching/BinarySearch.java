package org.google.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){

        binarySearch(new int[]{ 12, 34, 10, 6, 40 },6);
        //6,10,12,34,40
    }

    //{ 12, 34, 10, 6, 40 }
    private static void binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        Arrays.sort(arr);

        while (low <= high) {
            int mid = low + ( (high - low) / 2);

            if (arr[mid] == key) {
                System.out.println("Index: " + mid);
                return;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Key not found");
    }





}

