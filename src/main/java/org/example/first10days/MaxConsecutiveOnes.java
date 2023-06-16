package org.example.first10days;

public class MaxConsecutiveOnes {

    public static void main(String[] args){

        findMaxConsecutives(new int[] {1,1,0,1,1,1});
    }
    //1,1,0,1,1,1
    private static void findMaxConsecutives(int arr[]){

        int maxConsecutive=0;
        int consecutive =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                consecutive=consecutive+1;
                maxConsecutive = Math.max(maxConsecutive,consecutive);

            }else{
                consecutive=0;
            }
        }
        System.out.println(maxConsecutive);
    }

}
