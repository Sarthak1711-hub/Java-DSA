import java.util.*;

public class KElementsReversalInQueue {

    Queue<Integer> queue;

    // Constructor
    KElementsReversalInQueue() {
        queue = new LinkedList<>();
    }

    // Insert element into queue
    public void enqueue(int x) {
        queue.offer(x);
    }

    // Reverse first K elements
    public void reverseFirstK(int k) {

        int n = queue.size();

        Stack<Integer> stack = new Stack<>();

        if (k > n || k < 0) {
            return;
        }

        // Step 1: Push first K elements into stack
        for (int i = 0; i < k; i++) {
            int elements = queue.poll();
            stack.push(elements);
        }

        // Step 2: Pop elements from stack and insert into queue
        for (int i = 0; i < k; i++) {
            int elements = stack.pop();
            queue.offer(elements);
        }

        // Step 3: Move remaining (n-k) elements to the back of queue
        for (int i = 0; i < n - k; i++) {
            int elements = queue.poll();
            queue.offer(elements);
        }
    }

    // Display queue
    public void display() {
        System.out.println(queue);
    }

    // Main function
    public static void main(String[] args) {

        KElementsReversalInQueue obj = new KElementsReversalInQueue();

        obj.enqueue(10);
        obj.enqueue(5);
        obj.enqueue(12);
        obj.enqueue(14);
        obj.enqueue(16);
        obj.enqueue(20);

        int k = 3;

        System.out.println("Original Queue:");
        obj.display();

        obj.reverseFirstK(k);

        System.out.println("Queue after reversing first K elements:");
        obj.display();
    }
}
