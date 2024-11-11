package org.google.arrays;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args){
        findMajorityElementInTheArray(new int[]{2,2,2,2,5,5,2,3,3,3,3,3,3,3,3,3,3});
    }

    //{2,2,2,2,5,5,2,3,3};

    private static void findMajorityElementInTheArray(int arr[]){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length-1;i++){

            int value=0;
            if(map.containsKey(arr[i])){
                 value=map.get(arr[i]);
                map.put(arr[i],value+1);
            }else{
                map.put(arr[i],1);
            }

            if(map.get(arr[i])>arr.length/2){
                System.out.println("Majority Element is present and element is"+arr[i]);
            }
        }
    }

    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> map = new HashMap();

        for(int i=0;i<size;i++){
            if(map.containsKey(a[i])){
                int temp = map.get(a[i]);
                map.put(a[i],temp+1);
            }else{
                map.put(a[i],1);
            }

            if(map.get(a[i]) > size/2){
                return a[i];
            }
        }
        return -1;
    }


}
