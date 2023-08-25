package org.example.arrays.recurssion;

public class TowerOfHanoi {

    public static void main(String[] args){

        toh(3,'A','B','C');
    }

    private static void toh(int n,char src,char temp,char dest){
        if(n==0)
            return;
        toh(n-1,src,dest,temp);
        System.out.println("Move "+n+" th disc from "+src+" to "+dest);
        toh(n-1,temp,src,dest);
    }
}
