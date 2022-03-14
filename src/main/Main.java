package main;

import main.Heap.MinHeap;
import main.Queue.MinPriorityQueue;
import main.Queue.MinPriorityQueueHeap;
import main.Tree.BinarySearchTree;

import java.util.Arrays;

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

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(8);
        binarySearchTree.insert(3);
        binarySearchTree.insert(10);
        binarySearchTree.insert(1);
        binarySearchTree.insert(6);
        binarySearchTree.insert(14);
        binarySearchTree.insert(4);
        binarySearchTree.insert(7);
        binarySearchTree.insert(13);

//        System.out.println(Arrays.toString(binarySearchTree.toArray()));

        int a = binarySearchTree.extractMin();
        System.out.println(a);
        int b = binarySearchTree.extractMin();
        System.out.println(b);
        int c = binarySearchTree.extractMin();
        System.out.println(c);
        int d = binarySearchTree.extractMin();
        System.out.println(d);
        int e = binarySearchTree.extractMin();
        System.out.println(e);
        int f = binarySearchTree.extractMin();
        System.out.println(f);
        int g = binarySearchTree.extractMin();
        System.out.println(g);
        int h = binarySearchTree.extractMin();
        System.out.println(h);
        int i = binarySearchTree.extractMin();
        System.out.println(i);
//        int j = binarySearchTree.extractMin();
//        System.out.println(j);

        binarySearchTree.insert(5);
        int j = binarySearchTree.extractMin();
        System.out.println(j);


//        System.out.println(Arrays.toString(binarySearchTree.toArray()));

    }
}
