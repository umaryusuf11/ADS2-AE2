package main;

import main.Queue.MinPriorityQueueBST;
import main.Queue.MinPriorityQueueEfficientBST;
import main.Queue.MinPriorityQueueHeap;
import main.Ropes.Ropes;

public class Main {

    public static void exampleMinHeapQueue(){
        System.out.println("Example of Min Heap Queue");
        MinPriorityQueueHeap minPriorityQueueHeap = new MinPriorityQueueHeap();
        minPriorityQueueHeap.insert(5);
        minPriorityQueueHeap.insert(4);
        minPriorityQueueHeap.insert(6);
        minPriorityQueueHeap.insert(3);
        minPriorityQueueHeap.insert(1);
        minPriorityQueueHeap.insert(3);
        minPriorityQueueHeap.insert(2);
        minPriorityQueueHeap.insert(1);
        minPriorityQueueHeap.insert(-3);

        System.out.println("Initial Queue: " + minPriorityQueueHeap);
        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println("--------------------------------");
        System.out.println();
    }

    public static void exampleMinHeapQueueWithInitialCapacity() {
        System.out.println("Example of Min Heap Queue With Inintial Capacity");
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

        System.out.println("Initial Queue: " + minPriorityQueueHeap);
        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());

        System.out.println(minPriorityQueueHeap.extractMin());


        System.out.println("--------------------------------");
        System.out.println();
    }

    public static void exampleMinBinarySearchTreeQueue() {
        System.out.println("Example of Min Binary Search Tree Queue");
        MinPriorityQueueBST minPriorityQueueBST = new MinPriorityQueueBST();
        minPriorityQueueBST.insert(8);
        minPriorityQueueBST.insert(3);
        minPriorityQueueBST.insert(10);
        minPriorityQueueBST.insert(1);
        minPriorityQueueBST.insert(6);
        minPriorityQueueBST.insert(14);
        minPriorityQueueBST.insert(4);
        minPriorityQueueBST.insert(7);
        minPriorityQueueBST.insert(13);

        System.out.println("Initial Queue: [ 8, 3, 10, 1, 6, 14, 4, 7, 13 ]");

        System.out.println(minPriorityQueueBST.extractMin());
        System.out.println(minPriorityQueueBST.extractMin());
        System.out.println(minPriorityQueueBST.extractMin());
        System.out.println(minPriorityQueueBST.extractMin());
        System.out.println(minPriorityQueueBST.extractMin());
        System.out.println(minPriorityQueueBST.extractMin());
        System.out.println(minPriorityQueueBST.extractMin());
        System.out.println(minPriorityQueueBST.extractMin());
        System.out.println(minPriorityQueueBST.extractMin());

        System.out.println("--------------------------------");
        System.out.println();


    }

    public static void exampleMinBinarySearchTreeEfficientQueue() {
        System.out.println("Example of Min Binary Search Tree With O(1) Min and Extract-Min Queue");
        MinPriorityQueueEfficientBST minPriorityQueueEfficientBST = new MinPriorityQueueEfficientBST();
        minPriorityQueueEfficientBST.insert(8);
        minPriorityQueueEfficientBST.insert(3);
        minPriorityQueueEfficientBST.insert(10);
        minPriorityQueueEfficientBST.insert(1);
        minPriorityQueueEfficientBST.insert(6);
        minPriorityQueueEfficientBST.insert(14);
        minPriorityQueueEfficientBST.insert(4);
        minPriorityQueueEfficientBST.insert(7);
        minPriorityQueueEfficientBST.insert(13);

        System.out.println("Initial Queue: [ 8, 3, 10, 1, 6, 14, 4, 7, 13 ]");
        System.out.println(minPriorityQueueEfficientBST.extractMin());
        System.out.println(minPriorityQueueEfficientBST.extractMin());
        System.out.println(minPriorityQueueEfficientBST.extractMin());
        System.out.println(minPriorityQueueEfficientBST.extractMin());
        System.out.println(minPriorityQueueEfficientBST.extractMin());
        System.out.println(minPriorityQueueEfficientBST.extractMin());
        System.out.println(minPriorityQueueEfficientBST.extractMin());
        System.out.println(minPriorityQueueEfficientBST.extractMin());
        System.out.println(minPriorityQueueEfficientBST.extractMin());

        System.out.println("--------------------------------");
        System.out.println();
    }

    public static void exampleRopes() {
        Ropes.optimalConnect(new int[] {4, 8, 3, 1, 6, 9, 12, 7, 2});
    }

    public static void main(String[] args) {
        // Part 1

        // a
        exampleMinHeapQueue();
        exampleMinHeapQueueWithInitialCapacity();
        //b
        exampleMinBinarySearchTreeQueue();
        //d
        exampleMinBinarySearchTreeEfficientQueue();

        // Part 2
        exampleRopes();
    }
}
