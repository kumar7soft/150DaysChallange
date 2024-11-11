package org.google.arrays;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {

    public static void main(String[] args){

    }

    private static void firstAndLastOcuurance(int arr[],int n,int x){

        int start = 0;
        int end = n-1;

        ArrayList<Integer> list = new ArrayList<>();
        list.set(0,-1);
        list.set(1,-1);
        while(start<end){
            if(arr[start] ==x){
                System.out.println("First Ocuurance at "+start);
                start++;
            }
        }
    }
}
