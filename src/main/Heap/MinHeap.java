package main.Heap;

public class MinHeap extends Heap{
    public MinHeap(int[] arr){
        A = arr;
        buildHeap();
    }
    @Override
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
}
