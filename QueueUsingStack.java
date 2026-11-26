import java.util.*;

public class QueueUsingStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    // Constructor
    QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Insert element into queue
    public void push(int x) {
        // Step 1: Move elements from stack 1 to stack 2

        while (!stack1.isEmpty()) {
            int value = stack1.peek();
            stack1.pop();
            stack2.push(value);
        }
        // Step 2: Enter the element to stack 1
        stack1.push(x);
        // Step 3: Move all the elements from stack 2 to stack 1
        while (!stack2.isEmpty()) {
            int value = stack2.peek();
            stack2.pop();
            stack1.push(value);
        }

    }

    // Remove element from queue
    public int pop() {

        return stack1.pop();
    }

    // Get front element
    public int peek() {

        return stack1.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {

        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Main function
    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Removed Element: " + queue.pop());

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Is Queue Empty: " + queue.isEmpty());
    }
}