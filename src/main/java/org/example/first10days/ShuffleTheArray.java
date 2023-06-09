package org.example.first10days;

public class ShuffleTheArray {

    public static void main(String[] args){

        shuffleTheArray(new int[] {2,5,1,3,4,7},3);
    }
    //nums = [2,5,1,3,4,7], n = 3

    private static void shuffleTheArray(int arr[],int n){
        int[] shuffledArray=new int[arr.length];
        int index =0;
        for(int i=0;i<n;i++){
            shuffledArray[index] =arr[i];
            index++;
            shuffledArray[index]=arr[i+n];
            index++;
        }

        for (int a :shuffledArray){
            System.out.print(a+": ");
        }
    }
}
