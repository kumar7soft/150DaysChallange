package org.example.arrays;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


public class PowerGame {

    public static void main(String[] args){

        //1 5 7 4
        //3 8 2 10
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // size of  the array
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt(); // elements of the array1
            }
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = scanner.nextInt(); // elements of the array1
            }

            CopyOnWriteArrayList<Integer> list1 = Arrays.stream(arr1)
                    .boxed() // Convert int to Integer
                    .collect(Collectors.toCollection(CopyOnWriteArrayList::new));
            CopyOnWriteArrayList<Integer> list2 = Arrays.stream(arr2)
                    .boxed() // Convert int to Integer
                    .collect(Collectors.toCollection(CopyOnWriteArrayList::new));

            findTheWinner(list1,list2);

        }

    }

    private static void findTheWinner(CopyOnWriteArrayList<Integer> arr1,CopyOnWriteArrayList<Integer> arr2){

        int count=0;
        for(int i=0;i<arr1.size();i++){
            for(int j=0;j<arr2.size();j++){
                if(arr1.get(i) >arr2.get(j)){
                    count=count+1;
                    arr1.remove(i);
                    arr2.remove(j);
                    break;
                }
            }
        }

        System.out.println(count);

    }
}
