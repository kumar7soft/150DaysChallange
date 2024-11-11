package org.revision.arrays;

import java.util.TreeMap;

public class SortOf0s1s {

    public static void main(String[] args){

    }

    private static void sortOfElements(int arr[]){
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
                Integer count = map.get(arr[i]);
                map.put(arr[i],count+1);
            }else{
               map.put(arr[i],1);
           }
        }

    }
}
