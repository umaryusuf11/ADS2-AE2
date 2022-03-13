package main;

import main.Heap.MinHeap;
import main.Queue.MinPriorityQueue;
import main.Queue.MinPriorityQueueHeap;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 15, 1, 4, 2, 5, 3, 1, 8, 6, 10 };

        MinHeap minHeap = new MinHeap(arr);
        System.out.println(minHeap);
//
//        MinPriorityQueue minPriorityQueue = new MinPriorityQueue(8);
//        minPriorityQueue.insert(5);
//        minPriorityQueue.insert(4);
//        minPriorityQueue.insert(6);
//        minPriorityQueue.insert(3);
//        minPriorityQueue.build();
//
//        System.out.println(minPriorityQueue.extractMin());

        MinPriorityQueueHeap minPriorityQueueHeap = new MinPriorityQueueHeap(8);
        minPriorityQueueHeap.insert(5);
        minPriorityQueueHeap.insert(4);
        minPriorityQueueHeap.insert(6);
        minPriorityQueueHeap.insert(3);
        minPriorityQueueHeap.insert(1);
        minPriorityQueueHeap.insert(3);
        minPriorityQueueHeap.insert(2);
        minPriorityQueueHeap.insert(1);
        minPriorityQueueHeap.insert(-3);





        System.out.println(minPriorityQueueHeap);
        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap);
        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap);
        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap);
        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap);
        System.out.println(minPriorityQueueHeap.extractMin());
    }
}
