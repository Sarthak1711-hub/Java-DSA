import java.util.*;

public class CelebrityProblem {

    static int findCelebrity(int[][] M, int n) {

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() >= 2) {
            int a = st.pop();
            int b = st.pop();

            if (M[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }

        }

        int celebIndex = st.pop();

        for (int i = 0; i < n; i++) {
            if (M[celebIndex][i] == 1) {
                return -1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != celebIndex) {

                if (M[i][celebIndex] == 0) {
                    return -1;
                }
            }

        }

        return celebIndex;
    }

    public static void main(String[] args) {

        int[][] M = {
                { 0, 1, 0 },
                { 0, 0, 0 },
                { 1, 1, 0 }
        };

        int n = 3;

        int result = findCelebrity(M, n);

        System.out.println(result);
    }
}