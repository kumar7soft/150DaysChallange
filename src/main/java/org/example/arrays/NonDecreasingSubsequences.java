package org.example.arrays;

import java.util.Scanner;

public class NonDecreasingSubsequences {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int result = countNonDecreasingSubsequences(N, arr);
            System.out.println(result);
        }
        scanner.close();
    }

    static int countNonDecreasingSubsequences(int N, int[] arr) {
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            dp[i] = 1; // Initialize all elements to 1
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] >= arr[j]) {
                    dp[i] = (dp[i] + dp[j]) % MOD;
                }
            }
        }

        int totalSubsequences = 0;
        for (int i = 0; i < N; i++) {
            totalSubsequences = (totalSubsequences + dp[i]) % MOD;
        }

        return totalSubsequences;
    }
}
