public class ClimbingStairs {

    static int climbing(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int ans = climbing(n - 1) + climbing(n - 2);
        return ans;
    }

    public static void main(String[] args) {

        int n = 2;
        int result = climbing(n);
        System.out.println(result);
    }
}
