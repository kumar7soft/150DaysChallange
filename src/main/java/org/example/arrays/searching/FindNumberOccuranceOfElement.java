package org.example.arrays.searching;

import java.util.Arrays;

public class FindNumberOccuranceOfElement {

    public  static void main(String[] args){

        findTheNumberOfOccurancesOfElement(new int[] {3,10,8,15,10,10,-2,15,3,-5,3,10,25,10,-5});
    }
    private static void  findTheNumberOfOccurancesOfElement(int arr[]){
        Arrays.sort(arr);

        int count=1;
        for(int i=0;i<arr.length-1;i++){
           if(i+1<arr.length && arr[i] ==arr[i+1]){
               count =count+1;
               System.out.println(arr[i] +"::"+count);
           }else{
               count=1;
           }

        }

    }

    //3,10,8,15,10,10,-2,15,3,-5,3,10,25,10,-5
}
