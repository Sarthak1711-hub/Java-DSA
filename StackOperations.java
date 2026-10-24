public class StackOperations {

    static class MyStack 
    {
        /* Second this code will execute */
       
        private int[] arr;    // arr = null
        private int capacity;  // capacity = 0
        private int top; // top = 0

        /* Third this code will execute */

        public MyStack(int capacity) {
            this.capacity = capacity; // capacity = 0 --> 3
            arr = new int[capacity];  // arr = null --> [3]
            this.top = -1;  // top = 0 --> -1
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

        
        /*Fourth after constructor execution completes the object reference is assigned to st.*/
        MyStack st = new MyStack(3); /* First this code will execute */

        st.push(10);
        st.push(20);

        System.out.println(st.peek());       
        System.out.println(st.getSize());    
        System.out.println(st.checkEmpty()); 

        st.pop();

        System.out.println(st.peek());       
    }
}
