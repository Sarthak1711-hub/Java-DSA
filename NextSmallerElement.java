
import java.util.ArrayList;
import java.util.Stack;

public class NextSmallerElement {

    static ArrayList<Integer> nextSmallerEle(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int n = arr.length;

        // Step 1: Initialize result arrayList with -1

        for (int i = 0; i < n; i++) {
            result.add(-1);
        }

        // Step 2: Monotonic Stack Pattern
        for (int i = n - 1; i >= 0; i--) {

            int currentElement = arr[i];

            // Step 3: Useless element needs to be popped out

            while (!st.isEmpty() && st.peek() >= currentElement) {
                st.pop();
            }

            // Step 4: Useful element needs to be added to the result array if st.peek() <=
            // currentElement

            if (!st.isEmpty()) {
                result.set(i, st.peek());
            }

            // Step 5: Push the currentElement anyways

            st.push(currentElement);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 8, 5, 2, 25 };

        ArrayList<Integer> result = nextSmallerEle(arr);

        System.out.println(result);
    }
}
