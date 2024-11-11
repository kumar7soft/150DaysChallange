package org.revision.prefixsum;

//ContineousSubArraySum leet code problem
public class ContineousSubArraySum {

    public static void main(String[] args){

        System.out.println( contineousSubArraySum(new int[]{23,2,6,4,7},6));
    }

    //[23,2,4,6,7], k = 6

    private static boolean contineousSubArraySum(int arr[],int k){

        boolean flag = false;
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            int temp = sum;
            sum=sum+arr[i];
            if(sum % k == 0){
                flag = true;
            }else{
                sum=sum-temp;
            }
        }
        return flag;

    }
}
