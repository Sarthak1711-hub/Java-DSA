public class FibonacciSeriesUsingRecursion {
    public static int fibonacciSeries(int val) {
        if (val == 0) {
            return 0;
        }
        if (val == 1) {
            return 1;
        }

        int ans = fibonacciSeries(val - 1) + fibonacciSeries(val - 2);
        return ans;
    }

    public static void main(String[] args) {
        int val = 10;
        int result = fibonacciSeries(val);
        System.out.println(result);
    }
}
