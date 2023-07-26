package org.example.hackerrank;

public class RightAngleTriangles {

    public  static void main(String[] args){

        printRightAngleTriangels(10);
    }
    private static  void printRightAngleTriangels(int c){
        for (int j = 1; j <= c; j++) {
            for (int k = 1; k <= c - j; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
