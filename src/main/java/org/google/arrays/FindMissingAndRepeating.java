package org.google.arrays;

import java.util.HashSet;

public class FindMissingAndRepeating {

    public static void main(String[] args){

        int arr[] = {1,1, 3};
        System.out.println(repeatingNumber(arr));
        System.out.println( missingNumber(arr));
    }
    
    private static int repeatingNumber(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.add(arr[i])){
                return arr[i];
            }
        }
        return -1;
    }
    private static int missingNumber(int arr[]){
        int count=1;
        for(int i=0;i<arr.length;){
            if(arr[i] != count){
                return count;
            }else{
                count=count+1;
            }
        }
        return -1;
    }
}
