package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExp {
    public static void main(String arg[]) {
        Queue<Integer> q = new LinkedList<>();

        // Inserts elements to the end of the queue
        q.add(3);
        q.add(2);
        q.add(6);
        q.add(4);
        q.add(5);

        int val = q.peek(); // Returns the element at the front of the queue

        // Iterate through the queue
        for (int i = 0; i < q.size(); i++) {
            int del = q.remove(); // Returns and removes the element at the front of the queue
            if (val < del) {
                val = del;
            }
            q.add(del);
        }

        // Print the maximum element
        System.out.println("Maximum element in the queue: " + val);
    }

}
