package main.Ropes;

import main.Queue.MinPriorityQueueHeap;

public class Ropes {

    private static int connectionCost(int x, int y){
        return x + y;
    }

    public static void optimalConnect(int[] ropes){
        MinPriorityQueueHeap queue = new MinPriorityQueueHeap();
        int totalCost = 0;

        for (int rope : ropes) {
            queue.insert(rope);
        }

        System.out.println("The initial queue is: " + queue);
        while (queue.size > 1){
            int x = queue.extractMin();
            int y = queue.extractMin();

            totalCost += connectionCost(x, y);

            System.out.println("Connected " + x + " and " + y + " for a cost of " + connectionCost(x, y));

            queue.insert(connectionCost(x, y));
            System.out.println("The new queue is: " + queue);
            System.out.println(" ");

        }

        System.out.println("The final rope length is: " + queue.extractMin());
        System.out.println("The total cost is: " + totalCost);
    }

}
