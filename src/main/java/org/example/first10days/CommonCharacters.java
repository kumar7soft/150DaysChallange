package org.example.first10days;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacters {
    public static List<Character> commonChars(String[] words) {
        int[] charCount = new int[26]; // Array to store the count of each character

        // Initialize the character count array with maximum possible values
        for (int i = 0; i < 26; i++) {
            charCount[i] = Integer.MAX_VALUE;
        }

        // Iterate through each word and update the character count array
        for (String word : words) {
            int[] wordCharCount = new int[26];
            for (char c : word.toCharArray()) {
                wordCharCount[c - 'a']++;
            }
            // Update the character count array with the minimum count for each character
            for (int i = 0; i < 26; i++) {
                charCount[i] = Math.min(charCount[i], wordCharCount[i]);
            }
        }

        // Create a list to store the common characters
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            // Add the common characters to the result list based on their count
            for (int j = 0; j < charCount[i]; j++) {
                result.add((char) ('a' + i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words1 = {"bella", "label", "roller"};
        System.out.println(commonChars(words1)); // Output: [e, l, l]

        String[] words2 = {"cool", "lock", "cook"};
        System.out.println(commonChars(words2)); // Output: [c, o]
    }
}

