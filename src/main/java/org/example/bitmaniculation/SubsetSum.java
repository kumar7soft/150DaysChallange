package org.example.bitmaniculation;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            findSubSetOfSum(arr,k);
        }
        scanner.close();
    }

    private static void  findSubSetOfSum(int arr[],int k){

        int n =arr.length;
        boolean falg=false;
        for(int i=0;i<(1<<n);i++){
            int sum=0;
            for(int j=0;j<n;j++){
                int i1 = i >> j;
                if (((i >> j) & i) == 1) {
                    sum=sum+arr[j];
                }
                if(sum == k){
                    falg=true;
                    break;
                }
            }

        }
        if(false)
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}
