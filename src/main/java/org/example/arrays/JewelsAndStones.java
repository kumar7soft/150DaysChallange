package org.example.arrays;

public class JewelsAndStones {

    public static int countJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example 1
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        int result1 = countJewelsInStones(jewels1, stones1);
        System.out.println("Example 1 - Count of stones that are also jewels: " + result1);

        // Example 2
        String jewels2 = "z";
        String stones2 = "ZZ";
        int result2 = countJewelsInStones(jewels2, stones2);
        System.out.println("Example 2 - Count of stones that are also jewels: " + result2);
    }
}
