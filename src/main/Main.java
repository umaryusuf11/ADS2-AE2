package main;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 15, 1, 4, 2, 5, 3, 1, 8, 6, 10 };
        int[] arl = { 4, 15, 5, 8, 10, 1, 3, 1, 4, 6, 2 };

        MaxHeap maxHeap = new MaxHeap(arr);
        System.out.println(maxHeap);
    }
}
