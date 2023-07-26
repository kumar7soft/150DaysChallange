package org.example.test;

import java.text.DecimalFormat;

public class Test {

    public static void main(String[] args){


        double value = 3.14159265359;
        DecimalFormat df = new DecimalFormat("#0.00"); // Two decimal places
        String formatted = df.format(value);
        System.out.println(formatted);
    }
}
