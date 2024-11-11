package org.google.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MaximumAppearingElement {

    static LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
    public static void main(String[] args){

        maxAppearingElement(new int[]{ 1, 4, 9, 13, 21 }, new int[]{ 15, 8, 12, 20, 30 });

        System.out.println(map);

    }

   // int[] L = { 1, 4, 9, 13, 21 };
   // int[] R = { 15, 8, 12, 20, 30 };
    private static void maxAppearingElement(int arr1[],int arr2[]){

        for(int i=0;i<arr1.length;i++){

            loadMap(arr1[i],arr2[i]);

        }
    }

    private static void loadMap(int a, int b){

        for(int i=a;i<=b;i++){

            if(map.containsKey(i)){
                 int temp = map.get(i);
                 map.put(i,temp+1);
            }else{
                map.put(i,1);
            }

        }
    }

}
