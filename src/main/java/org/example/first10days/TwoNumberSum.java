package org.example.first10days;



//Problem Statement
/* Given an array of integers nums and an integer target, return indices of the two numbers such that
 they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

 */


public class TwoNumberSum {

    public static void main(String[] args){
        int[] res = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(res[0]+"   "+res[1]);

    }

    //2,7,11,15 target : 9
    static public int[] twoSum(int[] nums, int target) {

        int[] arr=new int[2];
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(target==nums[start]+nums[end]){
                arr[0]=start;
                arr[1]=end;
            }else if(target > nums[start]+nums[end]){
                start=start+1;
            }else{
                end=end-1;
            }
        }
        return arr;
    }

}
