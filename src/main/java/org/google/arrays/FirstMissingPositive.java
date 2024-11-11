package org.google.arrays;

import java.util.TreeSet;

public class FirstMissingPositive {

    //[3,4,-1,1]
    public static void main(String[] args){

        firstMissingPositive(new int[]{3,4,-1,1});

    }
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Step 1: Place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        // Step 2: Find the first index where the number is not correct
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        // If all positions are correct, the missing number is n + 1
        return n + 1;
    }
    private static void findFirstMissingPositiveNumber(int arr[]){


        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int counter =1;
        for(Integer number : set){
            if(number >0 && number == counter){
                counter++;
            }else if(number >0){
                System.out.println("First Missing Number-->"+number);
                return;
            }
        }
    }
}
