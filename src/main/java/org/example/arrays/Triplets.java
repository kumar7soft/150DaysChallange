package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class Triplets {

    public  static void main(String[] args){

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int acount =0;
        int bcount =0;

        for(int i=0;i<a.size();i++){
            if(a.get(i) != b.get(i) && a.get(i) >b.get(i)){
                acount+=1;
            }else if(a.get(i) != b.get(i) && b.get(i) > a.get(i)){
                bcount+=1;
            }
        }
        List<Integer> list =new ArrayList<>();

        list.add(acount);
        list.add(bcount);
        return list;

    }
}
