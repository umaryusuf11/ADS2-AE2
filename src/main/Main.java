package main;

import main.Queue.MinPriorityQueueBST;
import main.Ropes.Ropes;

public class Main {
    public static void main(String[] args) {
//        int[] arr = { 4, 15, 1, 4, 2, 5, 3, 1, 8, 6, 10 };
//
//        MinHeap minHeap = new MinHeap(arr);
//        System.out.println(minHeap);
//
//        MinPriorityQueue minPriorityQueue = new MinPriorityQueue(8);
//        minPriorityQueue.insert(5);
//        minPriorityQueue.insert(4);
//        minPriorityQueue.insert(6);
//        minPriorityQueue.insert(3);
//        minPriorityQueue.build();
//
//        System.out.println(minPriorityQueue.extractMin());

//        MinPriorityQueueHeap minPriorityQueueHeap = new MinPriorityQueueHeap(8);
//        minPriorityQueueHeap.insert(5);
//        minPriorityQueueHeap.insert(4);
//        minPriorityQueueHeap.insert(6);
//        minPriorityQueueHeap.insert(3);
//        minPriorityQueueHeap.insert(1);
//        minPriorityQueueHeap.insert(3);
//        minPriorityQueueHeap.insert(2);
//        minPriorityQueueHeap.insert(1);
//        minPriorityQueueHeap.insert(-3);
//
//        System.out.println(minPriorityQueueHeap);
//        System.out.println(minPriorityQueueHeap.extractMin());
//
//        System.out.println(minPriorityQueueHeap);
//        System.out.println(minPriorityQueueHeap.extractMin());
//
//        System.out.println(minPriorityQueueHeap);
//        System.out.println(minPriorityQueueHeap.extractMin());
//
//        System.out.println(minPriorityQueueHeap);
//        System.out.println(minPriorityQueueHeap.extractMin());
//
//        System.out.println(minPriorityQueueHeap);
//        System.out.println(minPriorityQueueHeap.extractMin());

        MinPriorityQueueBST minPriorityQueueEfficientBST = new MinPriorityQueueBST();
        minPriorityQueueEfficientBST.insert(8);
        minPriorityQueueEfficientBST.insert(3);
        minPriorityQueueEfficientBST.insert(10);
        minPriorityQueueEfficientBST.insert(1);
        minPriorityQueueEfficientBST.insert(6);
        minPriorityQueueEfficientBST.insert(14);
        minPriorityQueueEfficientBST.insert(4);
        minPriorityQueueEfficientBST.insert(7);
        minPriorityQueueEfficientBST.insert(13);

//        System.out.println(Arrays.toString(minPriorityQueueEfficientBST.toArray()));

        int a = minPriorityQueueEfficientBST.extractMin();
        System.out.println(a);
        int b = minPriorityQueueEfficientBST.extractMin();
        System.out.println(b);
        int c = minPriorityQueueEfficientBST.extractMin();
        System.out.println(c);
        int d = minPriorityQueueEfficientBST.extractMin();
        System.out.println(d);
        int e = minPriorityQueueEfficientBST.extractMin();
        System.out.println(e);
        int f = minPriorityQueueEfficientBST.extractMin();
        System.out.println(f);
        int g = minPriorityQueueEfficientBST.extractMin();
        System.out.println(g);
        int h = minPriorityQueueEfficientBST.extractMin();
        System.out.println(h);
        int i = minPriorityQueueEfficientBST.extractMin();
        System.out.println(i);
//        int j = minPriorityQueueEfficientBST.extractMin();
//        System.out.println(j);

        System.out.println(minPriorityQueueEfficientBST.min());

        minPriorityQueueEfficientBST.insert(5);
        int j = minPriorityQueueEfficientBST.extractMin();
        System.out.println(j);

        Ropes.optimalConnect(new int[] {4, 8, 3, 1, 6, 9, 12, 7, 2});
    }
}
