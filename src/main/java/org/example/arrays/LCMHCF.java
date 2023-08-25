package org.example.arrays;

import java.util.Scanner;

public class LCMHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long lcm = findLCM(a, b);
            long hcf = findHCF(a, b);
            System.out.println(lcm + " " + hcf);
        }
        sc.close();
    }

    private static long findLCM(long a, long b) {
        return (a * b) / findHCF(a, b);
    }

    private static long findHCF(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

