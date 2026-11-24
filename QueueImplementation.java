
import java.util.*;

public class QueueImplementation{

    
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Insert elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // View front element
        System.out.println(queue.peek());

        // Remove front element
        System.out.println(queue.poll());

        // Queue size
        System.out.println(queue.size());

        // Check if empty
        System.out.println(queue.isEmpty());

        // Print queue
        System.out.println(queue);
    }
}
