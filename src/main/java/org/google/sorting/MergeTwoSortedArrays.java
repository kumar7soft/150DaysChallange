package org.google.sorting;

public class MergeTwoSortedArrays {

    public static void main(String[] args){

        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};
        mergeSortedArrays(a,b);
    }

    private static void mergeSortedArrays(int arr1[],int arr2[]){
        int arr[] = new int[arr1.length+arr2.length];
        int m =0 ;
        int n= 0;

        int counter = 0;
        while(m<arr1.length && n < arr2.length){
            if(arr1[m] <= arr2[n]){
                arr[counter] = arr1[m];
                m=m+1;
            }else{
                arr[counter] = arr2[n];
                n=n+1;
            }
            counter=counter+1;
        }
        while(m<arr1.length){
            arr[counter] =arr1[m];
            m=m+1;
            counter=counter+1;
        }
        while(n<arr2.length){
            arr[counter] =arr1[n];
            n=n+1;
            counter=counter+1;
        }

    }


}
