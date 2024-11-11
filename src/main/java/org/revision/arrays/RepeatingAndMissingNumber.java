package org.revision.arrays;

import java.util.Arrays;

public class RepeatingAndMissingNumber {

    public static void main(String[] args){

        findMissingAndRepeatingNumber(new int[]{3,1,3});
    }

    //3, 1, 3}
    private static void findMissingAndRepeatingNumber(int arr[]){

        boolean[] visited = new boolean[arr.length+1];
        Arrays.fill(visited,false);

        for(int i=0;i<arr.length;i++){
            int in = arr[i];
            if(visited[in]){
                System.out.println("Repeating Element ---> "+ arr[i]);
            }else{
                visited[in] = true;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(!visited[i]){
                System.out.println("Missing Element -->"+i);
            }
        }



    }
}
