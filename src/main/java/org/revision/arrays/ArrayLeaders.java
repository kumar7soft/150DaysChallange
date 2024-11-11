package org.revision.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders {

    public static void main(String[] args){

        findArrayLeaders(new int[]{16,17,4,3,5});
    }
    //16,17,4,3,5,
    private static ArrayList<Integer> findArrayLeaders(int arr[]){

        ArrayList<Integer> list =new ArrayList<>();
        list.add(arr[arr.length-1]);
        int maxElement = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>maxElement){
                list.add(arr[i]);
                maxElement=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
