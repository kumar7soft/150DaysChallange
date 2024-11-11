package org.google.arrays;

public class TheCelebrityProblem {

    public static void main(String[] args){

        int[][] arr = {{0, 1, 0},{0, 0, 0},{0, 1, 0}};

        findCelebrityInTheParty(arr);


    }

    private static void findCelebrityInTheParty(int[][] arr){

        int i = arr.length;
        int j = arr[0].length;
        boolean isCelebrity = true;

        for(int start=0;start<i;start++){
            isCelebrity=true;
            for(int end=0;end<j;end++){
                if(arr[start][end] !=0){
                    isCelebrity=false;
                    break;
                }
            }
            if(isCelebrity){
                System.out.println("Celebrity--->"+start);
            }
        }

    }
}
