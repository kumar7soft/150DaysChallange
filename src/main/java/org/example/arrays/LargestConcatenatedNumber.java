package org.example.arrays;

import java.util.Arrays;
import java.util.List;

public class LargestConcatenatedNumber {

    public static void main(String[] args){


      //findLargestConcatenedNumber(new int[] {49,73,58,30,72,44,78,23 });
       System.out.println(findFirstCharacter(498,49));


    }

    private static void findLargestConcatenedNumber(int arr[]){


        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length-1 ;j++) {
               // System.out.println("i---"+arr[i]+"j---->"+arr[j]);
                    int num = findFirstCharacter(arr[i], arr[j]);
                   // System.out.println("num---->"+num);
                    int temp = arr[i];
                    if (arr[i] != num) {
                        arr[i] = arr[j];
                        arr[j] = temp;

                }
            }
        }
        for(int a :arr){
            System.out.print(a+" :");
        }
    }


    //69 9 57 60
    private static int findFirstCharacter(int a,int b){
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        int length = s1.length()<=s2.length()?s1.length():s2.length();
        if(s1.equals(s2)){
            return a;
        }
        for(int i=0;i<length;i++){
           char c1 = s1.charAt(i);
            char c2 =s2.charAt(i);
            if(c1>c2){
                return a;
            }else{
                return b;
            }
            }
        return b;
        }

    }

