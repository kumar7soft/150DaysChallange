package org.google.searching;

public class IndexOfFirstOccurrenceInSorted {

    public static void main(String[] args){

        firstOcc(new int[] {5, 10, 10, 10, 20} ,5,5);
    }

    //  int arr[] = {5, 10, 10, 10, 20}, n = 5;
    static int firstOcc(int arr[], int n, int x)
    {
        int low = 0, high = n - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(x > arr[mid])
                low = mid + 1;

            else if(x < arr[mid])
                high = mid - 1;
            else
            {
                if(mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;

                else
                    high = mid - 1;
            }

        }
        return -1;
    }

}
