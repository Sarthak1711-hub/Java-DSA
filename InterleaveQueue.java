
import java.util.*;

public class InterleaveQueue {

    Queue<Integer> queue;

    InterleaveQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int x) {
        queue.offer(x);
    }

    public void interleave() {

        int queueSize = queue.size();
        int halfSize = queueSize / 2;

        if (queueSize % 2 != 0) {
            System.out.println("Queue must have even number of elements");
            return;
        }

        Queue<Integer> firstHalfQueue = new LinkedList<>();

        for (int i = 0; i < halfSize; i++) {
            int element = queue.poll();
            firstHalfQueue.offer(element);
        }

        for (int i = 0; i < halfSize; i++) {
            queue.offer(firstHalfQueue.poll());
            queue.offer(queue.poll());
        }
    }

    public void display() {
        System.out.println(queue);
    }
    public static void main(String[] args) {

        InterleaveQueue obj = new InterleaveQueue();

        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(7);
        obj.enqueue(8);

        System.out.println("Original Queue:");
        obj.display();

        obj.interleave();

        System.out.println("Interleaved Queue:");
        obj.display();
    }
}
