public class BinarySearchOnAnswers {
    public static int binarySearch(int[] arr, int n) {
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid > n) {
                end = mid - 1;

            } else if (mid * mid == n) {
                return mid;

            } else {
                ans = mid;
                start = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 56;
        int result = binarySearch(arr, target);

        System.out.println("Square Root is: " + result);

    }

}
