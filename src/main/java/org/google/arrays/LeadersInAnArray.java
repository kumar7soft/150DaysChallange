package org.google.arrays;

public class LeadersInAnArray {

    public static void main(String[] args){
        leaderInAnArray(new int[] {16, 17, 4, 3, 5, 2});
    }

    //{16, 17, 4, 3, 5, 2}
    private static void leaderInAnArray(int[] arr){

        int x = arr.length-1;
        int max=arr[arr.length-1];
        System.out.print(arr[arr.length-1]+":");
        for(int i=x;i>0;i--){

            if(arr[x-1]>arr[x] && arr[x-1]>max){
                System.out.print(arr[x-1]+":");
                max=arr[x-1];
            }
            x=x-1;
        }


    }
}
