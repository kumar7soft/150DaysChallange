package org.example.bitmaniculation;

public class LonelyInteger {

    public static int lonelyinteger(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result ^ a[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr3 = {0, 0, 1, 2, 1};
        System.out.println(lonelyinteger(arr3)); // Output: 2
    }
}

