package org.example.bitmaniculation;

public class ConvertToBinary {

    public static void main(String[] args) {
        int number = 4;
        String binaryString = convertToBinary(number);
        System.out.println("Binary representation of " + number + " is: " + binaryString);
    }

    // Function to convert a number to its binary representation
    private static String convertToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            // Extract the rightmost bit and add it to the result
            binary.insert(0, number & 1);
            // Right shift number to check the next bit
            number >>= 1;
        }

        return binary.toString();
    }
}