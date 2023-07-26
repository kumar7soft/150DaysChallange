package org.example.first10days;

import java.util.Arrays;

public class RemovalOfDuplicationFromUnsortedArray {

    public static void main(String[] args){
        removalDuplicatesFromUnsortedArray(new int[] {1, 2, 3, 2, 1, 5, 6, 7, 8, 9});
    }
    private static void removalDuplicatesFromUnsortedArray(int arr[]){
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
