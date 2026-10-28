public class SimplifyPath {

    static class MyStack {
        private String[] arr;
        private int capacity;
        private int top;

        public MyStack(int capacity) {
            this.capacity = capacity;
            arr = new String[capacity];
            this.top = -1;
        }

        public void push(String value) {
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

        public int getCapacity() {
            return capacity;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public String removeLast() { // remove last element from the stack
            if (top == -1) {
                return null;
            }

            return arr[top--];
        }

        public String simplifyPath(MyStack st, String Path) {

            String[] parts = Path.split("/");

            for (int i = 0; i < parts.length; i++) {

                if (parts[i].isEmpty()) {
                    continue;
                }

                if (parts[i].equals(".")) {
                    continue;
                }

                if (parts[i].equals("..") && parts[i].isEmpty()) {
                    continue;
                }

                if (parts[i].equals("..") && !st.isEmpty()) {
                    st.pop();
                }

                else {
                    st.push(parts[i]);
                }

            }
            if (st.isEmpty()) {

                return "/";
            } 
            
            else {

                StringBuilder str = new StringBuilder();

                while (!st.isEmpty()) {

                    // str.append("/");
                    // str.append(st.removeLast());
                    str.insert(0, "/" + st.removeLast());
                }

                return str.toString();
            }

        }
    }

    public static void main(String[] args) {

        String Path = "/home//foo/";
        MyStack st = new MyStack(Path.length());
        String ans = st.simplifyPath(st, Path);
        System.out.println(ans);
    }
}