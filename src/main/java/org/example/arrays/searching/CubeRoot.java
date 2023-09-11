package org.example.arrays.searching;

public class CubeRoot {

    public static void main(String[] argss){

        customCuberoot(8);
    }

    private static void findCubeRoot(int x){
        double left = 0;
        double right = x;
        double mid = (left + right) / 2;
        double epsilon = 1e-4; // Small value for precision

        while (Math.abs(mid * mid*mid - x) > epsilon) {
            if (mid * mid*mid < x) {
                left = mid;
            } else {
                right = mid;
            }
            mid = (left + right) / 2;
        }

       System.out.println(mid);
    }


    public static double customCuberoot(double x) {
        double guess = x / 2; // Initial guess
        double epsilon = 1e-6; // Small value for precision

        while (Math.abs(guess * guess* guess - x) > epsilon) {
            guess = 0.5 * (guess + x / guess); // Improved guess using Newton-Raphson formula

        }
        System.out.println(guess);
        return guess;
    }
    }

