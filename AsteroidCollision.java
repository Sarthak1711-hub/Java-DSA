
import java.util.Stack;
import java.util.Arrays;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            int asteroid = asteroids[i];

            boolean destroyed = false;

            while (!st.isEmpty()) {

                if (st.peek() < 0 && asteroid > 0) {
                    break;

                } else if (st.peek() < 0 && asteroid < 0) {
                    break;

                } else if (st.peek() > 0 && asteroid > 0) {
                    break;

                } else {

                    if (st.peek() > -asteroid) {
                        destroyed = true;
                        break;

                    } else if (st.peek() < -asteroid) {
                        st.pop();
                        continue;

                    } else {
                        destroyed = true;
                        st.pop();
                        break;
                    }
                }
            }

            if (!destroyed) {
                st.push(asteroid);
            }
        }

        int[] result = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] asteroids = {1, 2, 3, -4};

        System.out.println(
            Arrays.toString(asteroidCollision(asteroids))
        );
    }
}
