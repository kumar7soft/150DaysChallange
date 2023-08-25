package org.example.bitmaniculation;

import java.util.Scanner;

public class SwapBits {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
           int n = sc.nextInt();
            swapTheBits(n);
        }

    }

    private static void swapTheBits(int n){

        String binary = "";
        while (n > 0) {
            binary = n % 2 + binary;
            n /= 2;
        }
        int length =binary.length();
        int a =32-length;
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<a;i++){
            sb.append("0");
        }
        binary =sb.append(binary).toString();
        //1010
        char[] arr = binary.toCharArray();
        for(int i=arr.length-1;i>0;i=i-2){
            char temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1] = temp;
        }
        int i = binaryToDecimal(new String(arr));
        System.out.println(i);
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

