package org.example.arrays;

import java.util.Scanner;

public class ExcelColumnNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String s = sc.next();
            System.out.println(find(s));
        }

    }

    private static int find(String col){
        int res =0 ;
        for(int i=col.length()-1;i>=0;i--){
            res +=(col.charAt(i)-'A'+1)* Math.pow(26,col.length()-1-i);
        }
        return res;
    }
}