/*
  Umar Yusuf - ADS2 AE2
  MinPriorityQueueHeap.java
  2022

  This class implements a min priority queue using a modified array based heap.
 */

package main.Queue;

public class MinPriorityQueueHeap {
    int[] A;
    public int capacity;
    public int size = 0;

    public MinPriorityQueueHeap(){
        A = new int[10];
        capacity = 10;
    }

    public MinPriorityQueueHeap(int initialCapacity){
        A = new int[initialCapacity];
        capacity = initialCapacity;
    }

    public void insert(int x){
        if (size == capacity){
            doubleCapacity();
        }
        A[size] = x;
        size++;
        buildHeap();
    }

    public int min(){
        return A[0];
    }

    public int extractMin(){
        // if size is 0, cannot extract min
        if(size == 0){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        int min = A[0];
        // the concept is to replace the root with the last element, then reduce size so the duplicate is ignored,
        // so no for loop is needed
        A[0] = A[size - 1];
        size--;
        heapify(0, size);
        return min;
    }

    public void doubleCapacity(){
        // create new array with doubled capacity
        int[] newArray = new int[capacity * 2];
        // copy all elements from A to new array
        if (capacity >= 0) System.arraycopy(A, 0, newArray, 0, capacity);
        // set A to new array
        A = newArray;
    }

    public void buildHeap(){
        int n = size;
        for (int i = (n/2) - 1; i >= 0 ; i--) {
            heapify(i, n);
        }
    }
    public void heapify(int i, int n) {
        int l = left(i);
        int r = right(i);
        int smallest = i;

        if(l < n && A[l] < A[i]){
            smallest = l;
        }

        if(r < n && A[r] < A[smallest]){
            smallest = r;
        }

        if (smallest != i){
            swap(i, smallest);
            heapify(smallest, n);
        }
    }

    public int left(int i){
        return (i * 2) + 1;
    }
    public int right(int i){
        return (i * 2) + 2;
    }
    public void swap(int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public String toString() {
        StringBuilder string = new StringBuilder("PriorityQueue:" + size + " [ ");
        for (int i = 0; i < size; i++) {
            string.append(A[i]).append(" ");
        }
        string.append("]");
        return string.toString();
    }
}
