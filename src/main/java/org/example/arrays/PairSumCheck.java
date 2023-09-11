package org.example.arrays;

import java.util.HashSet;
import java.util.Set;

public class PairSumCheck {

    public static  void main(String[] args){

        checkPairSum(new int[] {-30,15,20,10,-10},-15);

    }
    //5 -15
    //-30 15 20 10 -10

    private static boolean  checkPairSum(int arr[],int k ){

        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = k - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    }

// 1 2 3 4
// k =3

