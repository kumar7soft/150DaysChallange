package org.example.arrays;

public class MaximumSumOfSubArray {

public static void main(String[] args){

    int arr[] ={1,2,3,-2,5};
    System.out.println(maxSubarraySum(arr,arr.length));
}

    static long maxSubarraySum(int arr[], int n){

        long maxh = 0, maxf = arr[0];
        //Iterating over the array.
        for(int i=0; i<n; i++){
            //Updating max sum till current index.
            maxh+=arr[i];
            //Storing max sum so far by choosing maximum between max
            //sum so far and max sum till current index.
            if(maxf<maxh)
                maxf=maxh;
            //If max sum till current index is negative, we do not need to add
            //it to result so we update it to zero.
            if(maxh<0)
                maxh=0;
        }
        //returning the result.
        return maxf;
    }
}
