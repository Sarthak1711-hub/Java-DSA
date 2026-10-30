import java.util.ArrayList;
import java.util.List;

public class NextGreaterNodeInLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class MyStack {

        private int[] arr;
        private int capacity;
        private int top;

        public MyStack(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            this.top = -1;
        }

        public void push(int value) {
            if (top == capacity - 1) {
                System.out.println("Value cannot be inserted");
                return;
            }

            top++;
            arr[top] = value;
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Value cannot be popped");
                return -1;
            }

            return arr[top--];
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }

            return arr[top];
        }

        public int getSize() {
            return top + 1;
        }

        public int getCapacity() {
            return capacity;
        }

        public boolean checkEmpty() {
            return top == -1;
        }

        public int[] nextLargerNodes(ListNode head) {

            // Convert Linked List into ArrayList
            // New Concept
            List<Integer> list = new ArrayList<>();

            ListNode temp = head;

            while (temp != null) {
                list.add(temp.val);
                temp = temp.next;
            }

            // Main logic
            int n = list.size();
            int[] ans = new int[n];

            MyStack st = new MyStack(n);

            for (int i = 0; i < n; i++) {

                while (!st.checkEmpty() && list.get(i) > list.get(st.peek())) {

                    int index = st.pop();

                    ans[index] = list.get(i);
                }

                st.push(i);
            }

            return ans;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(5);

        MyStack st = new MyStack(3);

        int[] ans = st.nextLargerNodes(head);

        System.out.print("Output: ");

        for (int value : ans) {
            System.out.print(value + " ");
        }
    }
}