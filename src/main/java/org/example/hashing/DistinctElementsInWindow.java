package org.example.hashing;

import java.util.HashSet;

public class DistinctElementsInWindow {

    public static void main(String[] args){

        fineDistinctElementsInTheWindow(new int[] {3,-4,-3,-4,-2,0,2,-2,6,0 },7);
    }

    //-2 -4 -2 4 -2  k=3
    //3,-4,-3,-4,-2,0,2,-2,6,0 k=7
    private static  void fineDistinctElementsInTheWindow(int arr[],int k){

        HashSet<Integer> hash = new HashSet<>();

        for(int i=0;i<=arr.length-k;i++){
            int count=0;
            for(int j=i;j<k+i;j++){
               if(hash.add(arr[j])){
                   count=count+1;
                }
            }
            System.out.print(count+" ");
            hash.clear();
        }

    }
}
