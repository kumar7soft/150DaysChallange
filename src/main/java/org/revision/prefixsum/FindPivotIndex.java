package org.revision.prefixsum;

// find pivot index leet code
public class FindPivotIndex {

    public static void main(String[] args){

        findPivotIndex(new int[]{1,7,3,6,5,6});
    }

    private static int findPivotIndex1(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }
        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // If the left sum equals the right sum, return the index
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            // Update the left sum for the next iteration
            leftSum += nums[i];
        }
        // If no pivot index is found, return -1
        return -1;
    }

   // 1,7,3,6,5,6
    private static int findPivotIndex(int arr[]){
        int res = -1;
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i] = sum+arr[i];
            sum=arr[i];
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[arr.length-1]-arr[i]){
                res = i;
            }
        }


        return res;
    }
}
