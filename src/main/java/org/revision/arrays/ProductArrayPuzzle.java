package org.revision.arrays;

public class ProductArrayPuzzle {

    public static void main(String[] args){

    }
    //10, 3, 5, 6, 2

    private static long[] productArrayPuzzle(int arr[]){
        long totalProduct = 1;
        long res[] = new long[arr.length];

        for(int i=0;i<arr.length;i++){
            totalProduct=totalProduct*arr[i];
        }
        for(int i=0;i<arr.length;i++){
            res[i] = totalProduct/arr[i];
        }

        return res;
    }
}
