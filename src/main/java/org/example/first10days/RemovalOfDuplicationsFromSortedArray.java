package org.example.first10days;

public class RemovalOfDuplicationsFromSortedArray {


   /* Input: arr[] = {2, 2, 2, 2, 2}
    Output: arr[] = {2}
    Explanation: All the elements are 2, So only keep one instance of 2.

    Input: arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
    Output: arr[] = {1, 2, 3, 4, 5} */

    public static void main(String[] args){

        int i = removeDuplicates(new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5}, 9);
        System.out.println(i);
    }

    static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
        int j = 0;
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        arr[j++] = arr[n-1];
        return j;
    }
}
