package org.example.bitmaniculation;

public class BinaryToNumber {

    public  static void  main(String[] args){

        System.out.println(binaryToDecimal("1000"));
    }

    public static int binaryToDecimal(String binaryString) {
        int decimalNumber = 0;
        int power = 1;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char bit = binaryString.charAt(i);
            if (bit == '1') {
                decimalNumber += power;
            }
            power *= 2;
        }

        return decimalNumber;
    }
}
