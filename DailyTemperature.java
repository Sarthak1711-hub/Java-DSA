import java.util.Arrays;

public class DailyTemperature {

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

        public int pop() {
            if (top == -1) {
                System.out.println("Value cannot be popped");
                return -1;
            }

            return arr[top--];
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

        public int[] dailyTemperature(int[] temperatures, int[] ans) {

            for (int i = 0; i < temperatures.length; i++) {

                // This condition checks whether the current day's temperature is greater than
                // the temperature at the index on top of the stack.
                while (!checkEmpty() && temperatures[i] > temperatures[peek()]) {

                    int previousDay = pop();
                    ans[previousDay] = i - previousDay;
                }

                push(i);
            }

            return ans;
        }

    }

    public static void main(String[] args) {

        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] ans = new int[temperatures.length];

        MyStack st = new MyStack(temperatures.length);

        st.dailyTemperature(temperatures, ans);

        System.out.println(Arrays.toString(ans));
    }
}