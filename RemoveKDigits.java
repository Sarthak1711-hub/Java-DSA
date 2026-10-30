
public class RemoveKDigits {

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

        public char pop() {
            if (top == -1) {
                System.out.println("Value cannot be popped");
                return '\0';
            }

            return arr[top--];
        }

        public char peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return '\0';
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

        public String removeKDigits(String num, int k) {

            if (k >= num.length()) {
                return "0";
            }

            // Step 1: String to Character Array
            char[] ch = num.toCharArray();

            // Step 2: Monotonic Stack
            for (int i = 0; i < ch.length; i++) {

                while (!checkEmpty() && k > 0
                        && peek() > ch[i]) {

                    pop();
                    k--;
                }

                push(ch[i]);
            }

            // Step 3: Handle remaining removals
            while (!checkEmpty() && k > 0) {
                pop();
                k--;
            }

            // Step 4: Build the answer
            StringBuilder ans = new StringBuilder();

            while (!checkEmpty()) {
                ans.append(pop());
            }

            ans.reverse();

            // Step 5: Remove leading zeros
            int i = 0;

            while (i < ans.length() && ans.charAt(i) == '0') {
                i++;
            }

            String result = ans.substring(i);

            if (result.length() == 0) {
                return "0";
            }

            return result;
        }
    }

    public static void main(String[] args) {

        String num = "1432219";

        int k = 3;

        MyStack st = new MyStack(num.length());

        String ans = st.removeKDigits(num, k);

        System.out.println("Output: " + ans);
    }
}
