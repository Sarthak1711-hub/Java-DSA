public class RemoveAdjacentDuplicatesInString {

    static class MyStack {

        private char[] arr;
        private int capacity;
        private int top;

        public MyStack(int capacity) {
            this.capacity = capacity;
            arr = new char[capacity];
            this.top = -1;
        }

        public void push(char value) {
            if (top == capacity - 1) {
                System.out.println("Value cannot be inserted");
                return;
            }

            top++;
            arr[top] = value;
        }

        public void pop() {
            if (top == -1) {
                System.out.println("Value cannot be popped");
                return;
            }

            top--;
        }

        public int getSize() {
            return top + 1;
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }

            return arr[top];
        }

        public int getCapacity() {
            return capacity;
        }

        public boolean checkEmpty() {
            return top == -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static String removeDuplicates(String s, MyStack st) {

        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (st.isEmpty()) {
                st.push(ch[i]);
                continue;
            }

            if (ch[i] == 'a' && st.peek() == 'a') {
                st.pop();
            }

            else if (ch[i] == 'b' && st.peek() == 'b') {
                st.pop();
            }

            else if (ch[i] == 'c' && st.peek() == 'c') {
                st.pop();
            }

            else {
                st.push(ch[i]);
            }

        }

        StringBuilder result = new StringBuilder();

        while (!st.isEmpty()) {

            result.append((char) st.peek());
            st.pop();

        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {

        String s = "abcd";
        MyStack st = new MyStack(s.length());

        System.out.println(removeDuplicates(s, st));
    }
}