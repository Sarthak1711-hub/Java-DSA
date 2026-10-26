public class SortedInsertInStack {
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
                return -1;
            }
            return arr[top];
        }

        public int getSize() {
            return top + 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        // public void SortedInsert(MyStack st, int val) {

        // if (st.getSize() <= 1) {
        // return;
        // }

        // int firstVal = st.peek();

        // if (val < firstVal) {
        // pop();
        // SortedInsert(st, val);
        // push(firstVal);

        // } else {
        // push(val);
        // return;
        // }
        public void SortedInsert(MyStack st, int x) {
            if (st.isEmpty()) {
                st.push(x);
                return;
            }
            int topValue = st.peek();

            if (topValue > x) {
                st.pop();
                SortedInsert(st, x);
                st.push(topValue);
            } else {
                st.push(x);
                return;
            }

        }

    }

    public static void main(String[] args) {

        MyStack st = new MyStack(5);

        st.push(1);
        st.push(1);
        st.push(1);
        st.push(9);

        int x = 4;

        st.SortedInsert(st, x);

        for (int i = 0; i <= st.top; i++) {
            System.out.println(st.arr[i]);
        }
    }
}