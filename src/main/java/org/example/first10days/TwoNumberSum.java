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


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoNumberSum {

    public static void main(String[] args){


        int[] res = twoNumberSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(res[0]+"   "+res[1]);

    }

    //2,7,11,15 target : 9
    //nums = [3,2,4], target = 6
    static public int[] twoSum(int[] nums, int target) {

        HashSet<Integer> set = new HashSet();
        for(int num:nums) {
            int match =target-num;
            if(set.contains(match)) {
                return new int[] {match,num};
            }else {
                set.add(num);
            }
        }

        return new int[0];
    }

    static public int[] twoNumberSum(int[] nums,int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int y = target - nums[i];
            if(map.containsKey(y)){
                return new int[] {i, map.get(y) };
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    }

