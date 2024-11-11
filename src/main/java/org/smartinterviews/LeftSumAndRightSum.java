package org.smartinterviews;

import java.util.Scanner;

public class LeftSumAndRightSum {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        leftSumAndRightSum(arr,n);
    }

    //6 7 7
    private static void leftSumAndRightSum(int arr[],int n){

        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = 0;
        int sum = 0;
        for(int i=1;i<arr.length;i++){
            sum = sum+arr[i-1];
            left[i] = sum;
        }
        sum=0;
        right[arr.length-1] = 0;
        for(int i = arr.length-2;i>=0;i--){
            sum = sum+arr[i+1];
            right[i] = sum;
        }

        for(int i=0;i<arr.length;i++){
            arr[i] =Math.abs(left[i]-right[i]);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }

}
