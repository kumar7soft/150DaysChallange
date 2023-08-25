package org.example.arrays;

public class TheMissingNumber {
    public  static void main(String[] args){

    }

    private static void findTheMissingNumber(int arr[]){
        int actualSum = (100 *(100+1))/2;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
        }
        System.out.println(actualSum-currentSum);
    }
}
