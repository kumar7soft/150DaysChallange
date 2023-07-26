package org.example.first10days;

public class MinimumNumberOfJumps {

    //1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9
    public static int minJumps(int[] arr, int N) {
        if (N == 1) {
            return 0; // Already at the end
        }
        int maxReach = arr[0]; // Maximum index we can reach
        int steps = arr[0]; // Steps we can take in the current jump
        int jumps = 1; // Minimum number of jumps required
        for (int i = 1; i < N; i++) {
            if (i == N - 1) {
                return jumps; // Reached the end
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--; // Exhaust a step
            if (steps == 0) {
                jumps++; // Take a jump
                if (i >= maxReach) {
                    return -1; // Cannot reach the end
                }
                steps = maxReach - i;
            }
        }

        return -1; // Cannot reach the end
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int N1 = arr1.length;
        System.out.println(minJumps(arr1, N1)); // Output: 3

        int[] arr2 = {1, 4, 3, 2, 6, 7};
        int N2 = arr2.length;
        System.out.println(minJumps(arr2, N2)); // Output: 2
    }
}
