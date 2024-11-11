package org.google.arrays;

public class MinimumNumberOfJumps {

    public static void main(String[] args){

        minJumps(new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9});
    }

    //{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}

    static int minJumps(int[] arr) {
        int n = arr.length;

        if (n == 1)
            return 0;
        // If the array is empty or the first element is 0, we can't move forward
        if (n == 0 || arr[0] == 0)
            return -1;

        int jumps = 1; // We start with the first jump
        int maxReach = arr[0]; // The maximum index we can reach with current jumps
        int stepsLeft = arr[0]; // Steps left to reach the maximum index

        for (int i = 1; i < n; i++) {
            // If we reach the end of the array
            if (i == n - 1)
                return jumps;

            // Update the maximum index we can reach with current jumps
            maxReach = Math.max(maxReach, i + arr[i]);

            stepsLeft--;

            // If we've used all steps, we have to take a new jump
            if (stepsLeft == 0) {
                jumps++;

                // Check if the current position is a 0, meaning we can't move forward
                if (i >= maxReach)
                    return -1;

                stepsLeft = maxReach - i; // Reset stepsLeft to the remaining steps for the new jump
            }
        }

        return -1; // If we haven't reached the end of the array
    }

}
