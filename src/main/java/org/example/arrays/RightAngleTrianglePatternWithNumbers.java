package org.example.arrays;

public class RightAngleTrianglePatternWithNumbers {

    public static void main(String[] args){

        printRightAnglePattern(6);
    }

    private static void printRightAnglePattern(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;

            }
            System.out.println();
        }
    }
}
