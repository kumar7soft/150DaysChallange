package org.example.bitmaniculation;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            findRepeatingNumbers(arr);
        }
    }
    public static int[] findRepeatingNumbers(int[] arr) {
        int[] seen = new int[arr.length];
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (seen[arr[i] - 1] == 1) {
                result[0] = arr[i];
            } else {
                seen[arr[i] - 1] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (seen[i] == 0) {
                result[1] = i + 1;
                break;
            }
        }

        Arrays.sort(result);
        return result;
    }
}