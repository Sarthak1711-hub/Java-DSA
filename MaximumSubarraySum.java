public class MaximumSubarraySum {

    public static int Kadane() {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxiSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maxiSum = Math.max(maxiSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxiSum;
    }

    public static void main(String[] args) {
        int result = Kadane();
        System.out.println("Maximum Sum of Contiguous Subarray: " + result);
    }
}