package org.revision.prefixsum;

import java.util.HashSet;

// Sub Array Sum equals K
public class SubArraySumEqualsK {

    //1,1,1
    public static void main(String[] args){

        subArraySumEqualsK(new int[]{1,1,1},2);

    }

    private static void subArraySumEqualsK(int arr[],int k){

        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i] = sum+arr[i];
            sum=arr[i];
        }
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i=0;i<arr.length;i++){
            if(set.contains(k-arr[i])){
                count=count+1;
            }else{
                set.add(arr[i]);
            }
        }
        System.out.println(count);
    }
}
