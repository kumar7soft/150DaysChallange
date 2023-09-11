package org.example.arrays.searching;

public class FindTheSingleOccurannceElement {

    public static void main(String[] args){

        findTheSingleOccurance(new int[] {10,10,1,1,3,3,4,5,5,6,6,7,7});
    }

    //10,10,1,1,3,3,4,5,5,6,6,7,7
    private static void findTheSingleOccurance(int arr[]){

        for(int i=0;i<arr.length;){
            if(i+1<arr.length && arr[i] !=arr[i+1]){
                System.out.println("Single occurance element"+arr[i]);
                break;
            }else{
                i=i+2;
            }
        }
    }
}
