
public class ValidParentheses {

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

        public void pop() {
            if (top == -1) {
                System.out.println("Value cannot be popped");
                return;
            }

            top--;
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
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
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                st.push(arr[i]);
            } else {

                if (st.checkEmpty()) {
                    return false;
                }
                if (arr[i] == ')' && st.peek() != '(') {
                    return false;
                } else if (arr[i] == '}' && st.peek() != '{') {
                    return false;
                } else if (arr[i] == ']' && st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        if (st.checkEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        String s = "([[]])";
        MyStack st = new MyStack(s.length());
        boolean result = isValid(s, st);

        System.out.println(result);
    }
}