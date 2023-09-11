package org.example.arrays;

public class TripletWithSumK {

    public  static void main(String[] args){

        threeNumberSum(new int[] {12,45,52,65,21,645,234,-100,14,575,-80,112},54);
        threeNumberSumUsingWhileLoop(new int[] {12,45,52,65,21,645,234,-100,14,575,-80,112},54);
    }

    private static void threeNumberSumUsingWhileLoop(int arr[],int k){

        int n =arr.length;
        for(int i=0;i<n-2;i++){

            int start =i+1;
            int end =n-1;
            while(start<end){
                int sum =arr[i]+arr[start]+arr[end];
              if(arr[i]+arr[start]+arr[end] == k){
                  System.out.println("Construct the sum--->"+i+":"+start+":"+end);
                  break;
              }else if(sum <k){
                  start=start+1;
              }else{
                  end=end-1;
              }


            }
        }
    }

     // 1,20,40,100,80
    // 60   234-100-80
    //12,45,52,65,21,645,234,-100,14,575,-80,112
    private static  void threeNumberSum(int arr[] , int s){

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i+1;j<arr.length;j++){
                 sum=arr[i]+arr[j];
                for(int k=j+1;k<arr.length;k++){
                    sum=sum+arr[k];
                    if(s == sum){
                        System.out.println("Construct the sum--->"+i+":"+j+":"+k);
                    }
                    sum=sum-arr[k];
                }
            }
        }

    }
}
