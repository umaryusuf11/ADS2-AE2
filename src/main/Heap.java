package main;

import java.util.Arrays;

public abstract class Heap {
    int[] A;

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

    public abstract void heapify(int i, int n);

    public void heapify(){
        int n = A.length;
        heapify((n / 2) - 1, n);
    }

    protected void buildHeap(){
        int n = A.length;
        for (int i = (n/2) - 1; i >= 0 ; i--) {
            heapify(i, n);
        }
    }

    public int get(int i){
        return A[i];
    }

    public int[] getHeap(){
        return A;
    }

    public String toString() {
        return "main.Heap:" + A.length + " " + Arrays.toString(A);
    }
}
