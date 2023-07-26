package org.example.first10days;

public class FindMaxProfit {


  /*  Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
    Output: 865
    Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
    Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
    Maximum Profit  = 210 + 655 = 865 */

    public static void main(String[] args){


        findMaxProfit(new int[]{100, 180, 260, 310, 40, 535, 695});
    }

    private static void findMaxProfit(int arr[]){
        int maxProfit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                maxProfit=maxProfit+(arr[i]-arr[i-1]);
            }
        }
        System.out.println("MaxProfit----->"+maxProfit);
    }
}
