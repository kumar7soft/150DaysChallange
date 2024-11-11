package org.example.arrays;

import java.util.Scanner;

public class CustomSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number >= 0) {
            double squareRoot = binarySearchSqrt(number);
            System.out.println("Square root of " + number + " is approximately " + squareRoot);
        } else {
            System.out.println("Cannot calculate square root of a negative number.");
        }

        scanner.close();
    }


    public static double binarySearchSqrt(double x) {
        double left = 0;
        double right = x;
        double mid = (left + right) / 2;
        double epsilon = 1e-6; // Small value for precision
        while (Math.abs(mid * mid - x) > epsilon) {
            if (mid * mid < x) {
                left = mid;
            } else {
                right = mid;
            }
            mid = (left + right) / 2;
        }

        return mid;
    }

    // Custom square root calculation using the Newton-Raphson method
    public static double customSqrt(double x) {
        double guess = x / 2; // Initial guess
        double epsilon = 1e-6; // Small value for precision

        double abs = Math.abs(guess * guess - x);
        while (Math.abs(guess * guess - x) > epsilon) {
            guess = 0.5 * (guess + x / guess); // Improved guess using Newton-Raphson formula
            double ab = Math.abs(guess * guess - x);

        }
        return guess;
    }
}

