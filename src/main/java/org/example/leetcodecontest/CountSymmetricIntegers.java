package org.example.leetcodecontest;

public class CountSymmetricIntegers {

    public static  void  main(String[] args){

        System.out.println(countSymmetricIntegers(1,100));
    }
    public static int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(isSame(i)){
                count=count+1;
            }
        }

        return count;
    }

    private static boolean isSame(int number){
        String str = String.valueOf(number);
        int length = str.length();
        int s =length/2;
        int end =length-s;
        if(s !=0 && s<9) {
            String first = str.substring(0, s);
            String en = str.substring(end, str.length());
            s = Integer.valueOf(first);
            end = Integer.valueOf(en);
            s = findSum(s);
            end = findSum(end);
        }

        return s ==end ?true:false;

    }
    private static int findSum(int number){
        int sum =0;
        while(number !=0){
            int x = number % 10;
            sum=sum+x;
           number =number/10;
        }

        return sum;
    }
}
