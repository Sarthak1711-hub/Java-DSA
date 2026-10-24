public class MiddleElementOfStack {
    public static class MyStack {
        private int top;
        private int capacity;
        private int[] arr;

        public MyStack(int capacity) {

            this.top = -1;
            this.capacity = capacity;
            arr = new int[capacity];
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

        public int getSize() {

            int size = top + 1;
            return size;
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

        public void MiddleElement(MyStack st, int count, int length) {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }
            if (count == length / 2) {
                System.out.println("Middle Element is : " + st.peek());
                return;
            }
            st.pop();
            count++;
            MiddleElement(st, count, length);

        }

    }

    public static void main(String[] args) {

        MyStack st = new MyStack(11);

        int count = 0;

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);
        st.push(110);

        int length = st.getSize();

        st.MiddleElement(st, count, length);
    }
}
