import java.util.ArrayList;
import java.util.Stack;

public class LargestRectangleHistogram {

    static ArrayList<Integer> previousSmallerElement(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            result.add(-1);
        }

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                result.set(i, st.peek());
            }

            st.push(i);
        }

        return result;
    }

    static ArrayList<Integer> nextSmallerElement(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            result.add(n);
        }

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                result.set(i, st.peek());
            }

            st.push(i);
        }

        return result;
    }

    public static int getMaxArea(int[] arr) {

        int n = arr.length;

        ArrayList<Integer> prev = previousSmallerElement(arr);
        ArrayList<Integer> next = nextSmallerElement(arr);

        int maxArea = -1;

        for (int i = 0; i < n; i++) {

            int height = arr[i];

            int width = next.get(i) - prev.get(i) - 1;

            int area = width * height;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] arr = {60, 20, 50, 40, 10, 50, 60};

        System.out.println(getMaxArea(arr));
    }
}
