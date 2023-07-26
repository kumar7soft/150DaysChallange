package org.example.arrays;

import java.util.Scanner;
public class HollowDiamondPattern {

    public static void printHollowDiamond(int[] testCases) {
        for (int caseNum = 1; caseNum <= testCases.length; caseNum++) {
            int N = testCases[caseNum - 1];
            System.out.println("Case #" + caseNum + ":");

            // Upper Half
            for (int rowNumber = 1; rowNumber <= (N + 1) / 2; rowNumber++) {
                int spacesBeforeStar = N - rowNumber;
                int spacesBetweenStars = 2 * rowNumber - 3;

                // Print spaces before the first *
                for (int i = 0; i < spacesBeforeStar; i++) {
                    System.out.print(" ");
                }
                // Print the first *
                System.out.print("*");

                if (rowNumber >= 2) {
                    // Print spaces between the *'s
                    for (int i = 0; i < spacesBetweenStars; i++) {
                        System.out.print(" ");
                    }
                    // Print the second *
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }

            // Lower Half
            for (int rowNumber = (N - 1) / 2; rowNumber >= 1; rowNumber--) {
                int spacesBeforeStar = N - rowNumber;
                int spacesBetweenStars = 2 * rowNumber - 3;

                // Print spaces before the first *
                for (int i = 0; i < spacesBeforeStar; i++) {
                    System.out.print(" ");
                }
                // Print the first *
                System.out.print("*");

                if (rowNumber >= 2) {
                    // Print spaces between the *'s
                    for (int i = 0; i < spacesBetweenStars; i++) {
                        System.out.print(" ");
                    }
                    // Print the second *
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int T = scanner.nextInt();
        int[] testCases = new int[T];
        for (int i = 0; i < T; i++) {
            testCases[i] = scanner.nextInt();
        }

        // Output
        printHollowDiamond(testCases);

        scanner.close();
    }
}
