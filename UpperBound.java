public class UpperBound {
    public static int UpperBoundElement(int[] arr) {
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        int target = 1;
        int ans = length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
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
        int result = UpperBoundElement(arr);
        System.out.println("Upper bound found at: " + result + "th index");

    }
}
