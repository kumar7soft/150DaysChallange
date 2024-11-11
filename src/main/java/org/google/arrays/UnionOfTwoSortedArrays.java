package org.google.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args){

        unionOfTwoArray(new int[]{1, 2, 3, 4, 5},new int[]{1, 2, 3, 6, 7},5,5);
    }

   //arr1[] = {1, 2, 3, 4, 5}
   //arr2 [] = {1, 2, 3, 6, 7}
    private static ArrayList<Integer> unionOfTwoArray(int arr1[],int arr2[], int n, int m){
        TreeSet<Integer> set = new TreeSet();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            set.add(arr2[j]);
        }
        return new ArrayList<>(set);

    }
}
