package org.google.arrays;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class KlargestElements {

    public static void main(String[] args){

        int arr[] = {12, 5, 787, 1, 23,20,20};
        findKLargestElements(arr,3);
    }

    private static void findKLargestElements(int arr[],int x){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(3);
        minHeap.add(4);
        minHeap.add(5);
        minHeap.add(2);
       // minHeap.poll();
        System.out.println(minHeap);

    }

    int[] kLargest(int[] arr, int n, int k) {
        // code here

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        // Build the heap with the first k elements
        for (int i = 0; i < arr.length; i++) {
            if (minHeap.size() < k) {
                minHeap.add(arr[i]);
            } else if (arr[i] > minHeap.peek()) {
                minHeap.poll(); // Remove the smallest element in the heap
                minHeap.add(arr[i]); // Add the current element to maintain the heap size of k
            }
        }

        // Extract the elements from the heap into an array in descending order
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
