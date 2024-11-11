package org.google.important;

public class MoveZeroes {

    public static void main(String[] args){

        moveZerosToEnd(new int[]{0});
    }
    //0,1,0,3,12

    private static void moveZerosToEnd(int arr[]){
        int temp[] = new int[arr.length];
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                temp[counter] = arr[i];
                counter=counter+1;
            }
        }
        for(int i =0;i<temp.length;i++){
            arr[i] = temp[i];
        }
    }
}
