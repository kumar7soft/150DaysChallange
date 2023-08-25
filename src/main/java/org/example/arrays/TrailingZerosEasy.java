package org.example.arrays;

public class TrailingZerosEasy {

    public static void main(String[] args){

       long factorial = calculateTrailingZeros(20);
       int count=0;
       while(factorial != 0){
           long i = factorial % 10;
           if(i==0){
               count++;
           }else{
               break;
           }
           factorial=factorial/10;
       }
       System.out.println(count);
    }

    private static long calculateTrailingZeros(int number){
        long factorial =1;
        for(int i=number;number>0;number--){
            factorial=number*factorial;
        }
        System.out.println(factorial);
        return factorial;
    }
}
