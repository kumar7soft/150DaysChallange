package org.google.arrays;

import java.util.HashSet;

public class IntersectionOfSortedArray {

    public static void main(String[] args){

        intersectionOfSortedArray(new int[]{10,20,30},new int[]{10,30});
    }
    //10,20,30
    //10,30
    private static void intersectionOfSortedArray(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        for(int i=0;i<arr1.length;i++){
            if(!set.add(arr1[i])){
                System.out.println(arr1[i]);
            }
        }
    }
}
