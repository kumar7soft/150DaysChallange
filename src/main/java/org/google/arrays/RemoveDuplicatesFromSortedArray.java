package org.google.arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args){

    }
    private static  int removeDuplicatesFromSortedArray(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
          return set.stream() .mapToInt(Integer::intValue).toArray().length;

    }
}
