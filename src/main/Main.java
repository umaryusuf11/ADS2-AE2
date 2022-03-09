package main;

import main.Heap.MinHeap;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 15, 1, 4, 2, 5, 3, 1, 8, 6, 10 };

        MinHeap minHeap = new MinHeap(arr);
        System.out.println(minHeap);
    }
}
