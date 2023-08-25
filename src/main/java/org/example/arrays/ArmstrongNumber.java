package org.example.arrays;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int actualNumber = n ;
        long amstringNumber =0;

        while( n != 0){
           int k = n % 10;
            amstringNumber = amstringNumber+(k*k*k);
            n = n/10;
        }
        if(amstringNumber == actualNumber){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}