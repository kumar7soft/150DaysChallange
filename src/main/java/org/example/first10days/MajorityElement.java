package org.example.first10days;

import java.util.HashMap;

public class MajorityElement {

   /* Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
    Output : 4
    Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size.*/



    public static void main(String[] args){


        findMajorityElement(new int[]{3, 3, 4, 2, 4, 4, 2, 4, 4});

    }

    private static void findMajorityElement(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i])+1;
                if(count>arr.length/2){
                    System.out.println("Majority Element--->"+arr[i]);
                }else{
                    map.put(arr[i],count);
                }
            }else{
                map.put(arr[i],1);
            }
        }

    }
}
