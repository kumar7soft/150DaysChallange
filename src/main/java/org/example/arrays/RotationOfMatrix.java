package org.example.arrays;

public class RotationOfMatrix {

    public static void  main(String[] args){

        int[][] matrix = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        rotaitonOfMatrix(matrix);

    }

    private static int[][] rotaitonOfMatrix(int arr[][]){

        int n = arr.length;
        int m = arr[0].length;
        int mat[][]=new int[3][3];

        int counter1=0;
        for(int i=0;i<n;i++){
            int counter=0;
            for(int j=m-1;j>=0;j--){
                mat[counter1][counter] =arr[j][i];
                counter++;
            }

            counter1++;
        }
        return mat;
    }
}
