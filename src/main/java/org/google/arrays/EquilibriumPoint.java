package org.google.arrays;

public class EquilibriumPoint {

    public static void main(String[] args){

        findEquilibriumPoint(new int[] {-7, 1, 5, 2, -4, 3, 0});

    }
    //{-7, 1, 5, 2, -4, 3, 0}
    private static void findEquilibriumPoint(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            sum -= arr[i];  // sum is now the right sum for index i
            if(leftSum == sum){
                System.out.println("Equilibrium Point at index: " + i);
                return; // exit after finding the first equilibrium point
            }
            leftSum += arr[i];
        }
        System.out.println("No Equilibrium Point found");
    }

}
