package org.google.important;

public class BestTimetoBuyandSellStock {

    public static void main(String[] args){

        findBestTimeToBuyAndSellStocks(new int[]{7,6,4,3,1});
    }
    //[7,1,5,3,6,4]

    private static int findBestTimeToBuyAndSellStocks(int arr[]){

        int profit = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                profit=profit+arr[i+1]-arr[i];
            }
        }
       return profit;
    }
}
