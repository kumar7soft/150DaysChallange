package org.example.bitmaniculation;

public class ReverseBits {

    public static long reverseBits(long A) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            long l = result << 1;
            long l1 = A & 1;
            result = (result << 1) + (A & 1);
            A >>= 1;

        }
        return result;
    }
    public static void main(String[] args) {
        long input1 = 0;
        long input2 = 3;
        System.out.println(reverseBits(input1)); // Output: 0
        System.out.println(reverseBits(input2)); // Output: 3221225472
    }
}