package org.example.first10days;

public class RunningSumOf1dArray {

    public static void main(String[] args){

        runningSumOf1dArray(new int[] {1,2,3,4});
    }

    private static void runningSumOf1dArray(int arr[]){
        int sum=arr[0];
        for(int i=0;i<arr.length;i++){
            arr[i]=sum;
            if(i !=arr.length-1)
            sum=sum+arr[i+1];
        }
        for(int a :arr){
            System.out.print(a);
        }
    }
}
