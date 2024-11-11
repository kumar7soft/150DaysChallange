package org.google.important;

public class RemoveDuplicatesInArray {

    public static void main(String[] args){

        removeDuplicateArray(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
    //{1, 1, 2};

    private static int removeDuplicateArray(int nums[]){

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
