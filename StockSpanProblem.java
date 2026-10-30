public class StockSpanProblem {

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

        public int stockSpanCalculator(int[] prices, int[] ans, int todayPrice) {

            int span = 1;

            for (int i = prices.length - 1; i >= 0; i--) {

                if (prices[i] <= todayPrice) {

                    span++;
                } 
                else {

                    break;
                }
            }

            return span;
        }

    }

    public static void main(String[] args) {

        int[] prices = { 7, 2, 1, 2 };
        int[] ans = new int[prices.length];
        int todayPrice = 2;

        MyStack st = new MyStack(prices.length);

        int span = st.stockSpanCalculator(prices, ans, todayPrice);

        System.out.println(span);
    }
}
