package org.example.arrays;

import java.util.HashSet;

public class PairDiffCheck {

    public static  void  main(String[] args){
        System.out.println(findPairDiff(new int[] {1,20,40,100,80},60));
    }
    //1,20,40,100,80

    private static boolean findPairDiff(int arr[] ,int k){

        HashSet<Integer> set = new HashSet<>();

        for(int a : arr){
            int c =k-a;
            if(set.contains(c)){
                return true;
            }else{
                set.add(a);
            }
        }

        return false;
    }
}
