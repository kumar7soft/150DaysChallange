package org.smartinterviews;

public class LongestContiguous {

    public static void main(String[] args){

        longestContigeous(new int[]{1,0,0,1,0,1,1,1,1,1,0},11);

        String str = "Kumar";
        new StringBuilder(str).reverse().toString();

    }

    //1,0,0,1,0,1,1,1,1,0
    private static void longestContigeous(int arr[],int n){

        int len =0;
        int maxLen =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                len=len+1;
            }else{
                maxLen=Math.max(len,maxLen);
                len = 0;
            }
        }
        System.out.println(maxLen);

    }
}
