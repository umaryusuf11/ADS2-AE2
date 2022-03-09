package test;

import main.Heap.MaxHeap;
import main.Heap.MinHeap;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class HeapTest {
    @Test
    void generateMaxHeap(){
        int[] arr = { 4, 15, 1, 4, 2, 5, 3, 1, 8, 6, 10 };
        MaxHeap maxHeap = new MaxHeap(arr);
        int[] expected = { 15, 10, 5, 8, 6, 1, 3, 1, 4, 4, 2 };

        assertEquals(Arrays.toString(maxHeap.getHeap()), Arrays.toString(expected));
    }

    @Test
    void generateMinHeap(){
        int[] arr = { 4, 15, 1, 4, 2, 5, 3, 1, 8, 6, 10 };
        MinHeap minHeap = new MinHeap(arr);
        int[] expected = { 1, 2, 1, 4, 4, 5, 3, 15, 8, 6, 10 };

        assertEquals(Arrays.toString(minHeap.getHeap()), Arrays.toString(expected));
    }
}
