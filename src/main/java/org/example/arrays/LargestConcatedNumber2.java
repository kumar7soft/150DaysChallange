package org.example.arrays;

import java.util.*;
import java.util.stream.*;

public class LargestConcatedNumber2 {

    public static void main(String[] args) {

            String result = largestConcatenatedNumber(new int[] {3,30,34,5,9 });
            System.out.println(result);
        }


    public static String largestConcatenatedNumber(int[] arr) {
        // Convert integers to strings
        String[] arrStr = Arrays.stream(arr)
                .mapToObj(Integer::toString)
                .toArray(String[]::new);

        // Custom sorting based on concatenated comparison
        for (int i = 0; i < arrStr.length - 1; i++) {
            for (int j = i + 1; j < arrStr.length; j++) {
                String option1 = arrStr[i] + arrStr[j];
                String option2 = arrStr[j] + arrStr[i];
                if (option2.compareTo(option1) > 0) {
                    // Swap elements to maintain descending order
                    String temp = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = temp;
                }
            }
        }

        // Concatenate sorted strings to get the largest number
        StringBuilder result = new StringBuilder();
        for (String numStr : arrStr) {
            result.append(numStr);
        }

        return result.toString();
    }
}
