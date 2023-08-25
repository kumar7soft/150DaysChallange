package org.example.arrays;

public class RightAngledTrianglePattern2 {

    public static void main(String[] args){

        printTriangle(5);
    }

    private static void printTriangle(int n){

        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
                for(int k=0;k<n;k++){
                    System.out.println(count);
                    count+=1;
                }
            }

        }
    }

}
