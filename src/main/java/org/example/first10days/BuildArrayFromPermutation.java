package org.example.first10days;

public class BuildArrayFromPermutation {

    public static void main(String[] args){

        buildArrayFromPermutation(new int[] {0,2,1,5,3,4});
    }

    //0,2,1,5,3,4
   static private void buildArrayFromPermutation(int arr[]){

        int[] arr1 =new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int k =arr[i];
            arr1[i] =arr[k];
        }

        for(int i :arr1){
            System.out.print(i+": ");
        }

    }
}
