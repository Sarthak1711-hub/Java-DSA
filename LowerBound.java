public class LowerBound {
    public static int LowerBoundElement(int[] arr) {
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        int target = 12;
        int ans = length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20};
        int result = LowerBoundElement(arr);
        System.out.println("Lower bound found at: " + result + "th index");

    }
}