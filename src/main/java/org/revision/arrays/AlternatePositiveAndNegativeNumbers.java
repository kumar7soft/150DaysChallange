package org.revision.arrays;

import java.util.ArrayList;

public class AlternatePositiveAndNegativeNumbers {

    public static void main(String[] args){

    }
    private static void performRearrange(int arr[]){

        ArrayList<Integer> pList = new ArrayList<>();
        ArrayList<Integer> nList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                pList.add(arr[i]);
            }else{
                nList.add(arr[i]);
            }
        }

        int i = 0, j = 0, k = 0;

        while (i < pList.size() && j < nList.size()) {
            arr[k++] = pList.get(i++);
            arr[k++] = nList.get(j++);
        }
        while(i < pList.size()){
            arr[k++] = pList.get(i++);
        }
        while(j<nList.size()){
            arr[k++] = nList.get(j++);
        }

    }

}
