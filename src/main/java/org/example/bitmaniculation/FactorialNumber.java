package org.example.bitmaniculation;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumber {

    public static int trailingZeros(int n) {
        int count = 0;
        for (int i = 5; i <= n; i += 5) {
            count += i / 25 + i / 125 + i / 625;
        }
        return count;
    }

    public static void main(String[] args) {
       // int factorial = (int) Math.factorial(5);
        int trailingZeros = trailingZeros(5);
        System.out.println(trailingZeros); // 1
    }
}
