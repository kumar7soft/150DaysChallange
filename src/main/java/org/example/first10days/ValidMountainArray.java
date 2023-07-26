package org.example.first10days;

public class ValidMountainArray {

    public static void main(String[] args){

        checkGivenArrayIsValidMountainOrNot(new int[] {1,2,3,4,9,8,7,6,6,5});
    }

    //1, 2, 3, 4, 9, 8, 7, 6, 5
    private static void checkGivenArrayIsValidMountainOrNot(int[] arr){

        if(arr.length < 3){
            System.out.println("Not a valid mountain");
        }

        int i=0;

        for(i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                break;
            }
        }
        if(i==arr.length){
            System.out.println("Not a valid mountain ");
        }

        for(;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                break;
            }
        }
        if(i==arr.length){
            System.out.println("Valid mountain");
        }else{
            System.out.println("Not a valid mountain");
        }
    }
}
