package org.example.bitmaniculation;

public class CountSetBits {

    public static void main(String[] args){

        countSetBits(15);
    }

    private static void  countSetBits(int n){
        int count=0;
        while(n != 0){
            n= n&(n-1);
            count=count+1;
        }
        System.out.println(count);
    }
}
