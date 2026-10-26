public class CheckSortedStack {

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

        public boolean CheckSorted(MyStack st) {

            if (st.getSize() <= 1) {
                return true;
            }

            int firstVal = st.peek();
            pop();

            int secondVal = st.peek();

            boolean ans = firstVal >= secondVal;

            boolean recursionAns = CheckSorted(st);

            push(firstVal);

            boolean finalAns = ans && recursionAns;

            return finalAns;
        }
    }

    public static void main(String[] args) {

        MyStack st = new MyStack(3);

        st.push(3);
        st.push(2);
        st.push(1);

        boolean result = st.CheckSorted(st);

        System.out.println(result);

        for (int i = 0; i <= st.top; i++) {
            System.out.println(st.arr[i]);
        }
    }
}