package org.example.first10days;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueElements {

    public static void main(String[] args) {
       int matrix1[][] ={{1,2,3},{4,5,6}};
       int matrix2[][] ={{1,2,3},{4,5,6}};
// 3*2
        int n=2;
        int m=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
            }
            System.out.println();

        }
    }
}
