package org.example.first10days;

public class MoveZerosToEnd {

   /* Input:
    N = 5
    Arr[] = {3, 5, 0, 0, 4}
    Output: 3 5 4 0 0
    Explanation: The non-zero elements
    preserve their order while the 0
    elements are moved to the right. */
    public static void main(String[] args){

        moveAllZeroToEnd(new int[] {3, 5, 0, 0, 4});
    }

    private static void moveAllZeroToEnd(int arr[]){
        int array[]=new int[arr.length];

        int count=arr.length-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] ==0){
                array[count] =0;
                count=count-1;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                array[i]=arr[i];
                count++;
            }
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }

    }

}
