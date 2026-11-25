
import java.util.*;

class StackUsingQueue {

    Queue<Integer> queue1;
    Queue<Integer> queue2;
    Queue<Integer> temp;

    // Constructor
    StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();

    }

    public void push(int x) {
        
        queue1.offer(x);

        int n = queue1.size()-1;

        for(int i =0;i<n;i++){

            int value = queue1.poll();
            queue1.offer(value);
        }
        
        // step1: insert the element to queue 2
        // queue2.offer(x);

        // Step2: copy elements from queue 1 to queue 2
        // while (!queue1.isEmpty()) {
        //     queue2.offer(queue1.poll());

        // }

        // step3: swap queue 1 and queue 2
        // temp = queue1;
        // queue1 = queue2;
        // queue2 = temp;

    }

    // Remove and return the top element
    public int pop() {

        return queue1.poll();
    }

    // Return the top element
    public int top() {

        return queue1.peek();
    }

    // Check whether stack is empty
    public boolean empty() {

        return queue1.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {

        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
        stack.push(40);
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.empty());

    }
}
