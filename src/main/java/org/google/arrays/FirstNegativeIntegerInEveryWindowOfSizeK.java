package org.google.arrays;

public class FirstNegativeIntegerInEveryWindowOfSizeK {

    public static void main(String[] args){
        findFirstNegativeElementInSubArray(new int[] {-8, 2, 3, -6, 10},2);
    }

    private static void findFirstNegativeElementInSubArray(int arr[],int x){

        for(int i=0;i<arr.length;i++){
            boolean flag =false;
            for(int j=i;j<i+x && arr.length > i+x ;j++){
                if(arr[j]<0){
                    flag=true;
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(!flag )
                System.out.print(0);
        }
    }
}
