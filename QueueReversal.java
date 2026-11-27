
import java.util.*;

public class QueueReversal {

    Queue<Integer> queue;
    Stack<Integer> stack;

    // Constructor
    QueueReversal() {
        queue = new LinkedList<>();
        stack = new Stack<>();
    }

    public void enqueue(int x) {
        queue.offer(x);
    }

    // Reverse the queue
    public void reverse() {

        // Step 1: Move elements from Queue to Stack
        while (!queue.isEmpty()) {
            int value = queue.poll();
            stack.push(value);
        }

        // Step 2: Move elements from Stack to Queue
        while (!stack.isEmpty()) {
            int element = stack.pop();
            queue.offer(element);
        }
    }

    public void display() {
        System.out.println(queue);
    }

    public static void main(String[] args) {

        QueueReversal obj = new QueueReversal();

        obj.enqueue(10); 
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);

        System.out.println("Original Queue:");
        obj.display();

        obj.reverse();

        System.out.println("Reversed Queue:");
        obj.display();
    }
}
