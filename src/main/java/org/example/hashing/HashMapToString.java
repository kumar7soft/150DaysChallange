package org.example.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapToString {
    public static void main(String[] args) {
        // Create a HashMap with sample data
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Kumar", "Hello");
        hashMap.put("JPA", "Hi");

        // Build the string with desired format
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            result.append("HI ").append(entry.getKey()).append(",\n");
        }

        // Print the final result
        System.out.println(result.toString());
    }
}

