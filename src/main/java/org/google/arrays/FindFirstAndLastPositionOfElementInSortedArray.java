package org.google.arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args){

        int[] position = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println(position[0]+" "+position[1]);


    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeftBound(nums, target);
        result[1] = findRightBound(nums, target);
        return result;
    }

    private int findLeftBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }

    private int findRightBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                result = mid;
            }
        }
        return result;
    }
}
