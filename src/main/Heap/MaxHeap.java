package main.Heap;

public class MaxHeap extends Heap{
    public MaxHeap(int[] arr){
        A = arr;
        buildHeap();
    }
    @Override
    public void heapify(int i, int n) {
        int l = left(i);
        int r = right(i);
        int largest = i;

        if(l < n && A[l] > A[i]){
            largest = l;
        }

        if(r < n && A[r] > A[largest]){
            largest = r;
        }

        if (largest != i){
            swap(i, largest);
            heapify(largest, n);
        }
    }
}
