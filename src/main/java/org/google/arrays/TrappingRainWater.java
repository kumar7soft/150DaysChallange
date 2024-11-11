package org.google.arrays;

public class TrappingRainWater {

    public static void main(String[] args){

        findUnitsOfRainWaterConserving(new int[] {3,0,1,2,5});
    }

    //3,0,1,2,5
    private static void findUnitsOfRainWaterConserving(int arr[]){

        int result =0;
        for(int i=0;i<arr.length-1;i++){
            int lmax = arr[0];
            int rmx =arr[0];
            for(int j=0;j<i;j++){
                lmax = Math.max(lmax,arr[j]);
            }
            int rmax =arr[i];
            for( int j=i+1;j<arr.length;j++){
                rmax = Math.max(rmax,arr[j]);
            }


           result = result +Math.min(lmax,rmax)-arr[i];

        }

        System.out.println(result);


    }
}
