package org.example.bitmaniculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XOROfSumOfPairs {

    public static void main(String[] args){

        printSum(new int[] {15,35,25,10,15,12});
    }

    private static void printSum(int arr[]){

       List<int[]> list = new ArrayList<>();

       int len =arr.length;
       int sum =0;

       for(int i=0;i<arr.length;i++){
           int a[] =new int[len];
           for(int j=0;j<arr.length;j++){
               sum=arr[i] +arr[j];
               a[j] =sum;
           }
          list.add(a);
       }

       int array[] = new int[arr.length];
       for(int i =0;i< list.size();i++){
           int ar[] =list.get(i);
           array[i] = Arrays.stream(ar).reduce(0, (a, b) -> a ^ b);
       }
       sum = Arrays.stream(array).reduce(0, (a, b) -> a ^ b);
       System.out.println(sum);

    }
}
