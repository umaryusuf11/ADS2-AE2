package main.Queue;

import main.Heap.MinHeap;

public class MinPriorityQueue {
    public MinHeap queue;
    int[] a;
    public int size = 0;

    public MinPriorityQueue(int size){
        int[] arr = new int[size];
        queue = new MinHeap(arr);
    }

    public void insert(int x){
        queue.set(size, x);
        size++;
    }

    public void build(){
        queue.buildHeap();
    }

    public int min(){
        return queue.get(0);
    }

    public int extractMin(){
        int min = min();
        queue.set(0, 0);
        size--;
        return min;
    }

    @Override
    public String toString() {
        return "MinPriorityQueue{" +
                "queue=" + queue +
                '}';
    }
}
