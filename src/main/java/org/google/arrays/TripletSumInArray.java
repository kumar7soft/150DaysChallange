package org.google.arrays;

public class TripletSumInArray {

    public static void main(String[] args){

    }

    private static boolean trupletSum(int arr[],int n , int x){

        boolean tripletSum = false;
        for(int i=0;i<n-2;i++){

            int right = i+1;
            int left = n-1;

            while(right < left){
                int sum = arr[i]+arr[right]+arr[left];
                if(sum == x){
                   tripletSum=true;
                }else if(sum <x){
                    left++;
                }else{
                    right--;
                }
            }

        }

        return  tripletSum;
    }
}
