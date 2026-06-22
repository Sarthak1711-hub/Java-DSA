public class PeakIndexInMountainArray {

    public static int PeakIndex(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 5, 3, 1 };
        int result = PeakIndex(arr);
        System.out.println("peak index is: " + result);

    }
}
