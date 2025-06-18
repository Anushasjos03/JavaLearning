package queue;
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a queue of strings
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // Display the front element without removing
        System.out.println("Front of queue: " + queue.peek());

        // Remove and display elements in FIFO order
        System.out.println("Removing and displaying elements:");
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }

        // Queue is now empty
        System.out.println("Queue empty? " + queue.isEmpty());

	}

}
