public class StringIsValidUsingStack {
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

        public char peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return '\0';
            }

            return arr[top];
        }

        public boolean checkEmpty() {
            return top == -1;
        }
    }

    public static boolean isValid(String s, MyStack st) {

        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'b') {
                st.push(arr[i]);
            } else {

                if (st.getSize() < 2) {
                    return false;
                }
                if (st.peek() != 'b') {
                    return false;
                }
                st.pop();
                if (st.peek() != 'a') {
                    return false;
                }
                st.pop();

            }
        }

        if (st.checkEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s = "abcabc";
        MyStack st = new MyStack(s.length());
        boolean result = isValid(s, st);

        System.out.println(result);
    }
}
