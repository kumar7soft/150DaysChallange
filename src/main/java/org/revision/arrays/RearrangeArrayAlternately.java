package org.revision.arrays;

public class RearrangeArrayAlternately {

    public static void main(String[] args){

        rearrange(new long[]{1,2,3,4,5,6},6);

        int n=2;
        System.out.println(n/2);
    }
    //{1,2,3,4,5,6}

    public static void rearrange(long arr[], int n){

        int max_idx = n - 1, min_idx = 0;
        // Use a number greater than the maximum element in the array to encode
        int max_elem = (int) (arr[max_idx] + 1);

        // Traverse the array elements
        for (int i = 0; i < n; i++) {
            // At even index, we add the maximum element
            if (i % 2 == 0)
                arr[i] = arr[i]+(arr[max_idx--] % max_elem) * max_elem;
                // At odd index, we add the minimum element
            else
                arr[i] = arr[i]+(arr[min_idx++] % max_elem) * max_elem;
        }

        // Decode elements back to their proper form
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;

    }

    private static void traverseByOneStep(int arr[]){
        for(int i=arr.length-1;i>0;i--){
            int temp =arr[i-1];
            arr[i-1]=arr[i];
            arr[i] = temp;
        }

    }

}
