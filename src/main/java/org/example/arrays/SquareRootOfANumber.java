package org.example.arrays;

public class SquareRootOfANumber {

    public static void main(String[]  args){

        findTheSquareRootOfPerfectSquare(100);
    }


    private static void findTheSquareRootOfPerfectSquare(int n){

        int l=1;
        int h=n;

        while(l<=h){
            int mid = l + (h - l) / 2;
            if(mid*mid == n){
                System.out.println("The square root of a number is"+mid);
                break;
            }else  if(mid*mid >n){
                h=mid-1;
            }else if (mid*mid <n){
                l=mid+1;
            }
        }
    }
}
