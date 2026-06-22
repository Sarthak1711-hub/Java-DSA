public class PivotIndexInRotatedArray {
    public static int PivotIndex(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= arr[n - 1]) {
                end = mid - 1;

            } else {

                ans = mid;
                start = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 1, 2, 5, };
        int result = PivotIndex(arr);
        System.out.println("Pivot index is: " + result);
    }
}
