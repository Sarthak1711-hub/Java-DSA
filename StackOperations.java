
public class StackOperations {

    static class MyStack 
    {
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
    }

    public static void main(String[] args) {
        MyStack st = new MyStack(3);

        st.push(10);
        st.push(20);

        System.out.println(st.peek());       
        System.out.println(st.getSize());    
        System.out.println(st.checkEmpty()); 

        st.pop();

        System.out.println(st.peek());       
    }
}
