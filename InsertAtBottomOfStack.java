public class InsertAtBottomOfStack {

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

        public void InsertAtBottom(int val) {

            int temp = val;
            if (top == -1) {
                push(temp);
                return;
            }
            temp = peek();
            pop();
            InsertAtBottom(val);
            push(temp);

        }

    }

    public static void main(String[] args) {

        MyStack st = new MyStack(4);

        st.push(10);
        st.push(20);
        st.push(30);
        int length = st.getSize();
        System.out.println("the length is: " + length);
        st.InsertAtBottom(55);

    }
}
