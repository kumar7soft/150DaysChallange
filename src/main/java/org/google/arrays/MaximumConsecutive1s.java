package org.google.arrays;

public class MaximumConsecutive1s {

    public static void main(String[] args){

        findMaxConsecutiveOnes(new int[] {0,1,1,0,1,0,1,1,1,1});
    }

    //0,1,1,0,1,0

    //when ever in the flow if we see element as zero then we are updating current count as zero in other case updating the current count with additon

    private static void findMaxConsecutiveOnes(int arr[]){

        int maxConsecutive = 0;
        int currentConsecutive =0;
        for(int i=0;i<arr.length;i++){

          if(arr[i] == 0){
              currentConsecutive=0;
          }else{
              currentConsecutive=currentConsecutive+1;
              maxConsecutive = Math.max(currentConsecutive,maxConsecutive);
          }

        }

        System.out.println(maxConsecutive);
    }
}
