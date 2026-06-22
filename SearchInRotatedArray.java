public class SearchInRotatedArray {

    public static int pivotIndex(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n - 1;

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

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int searchArray(int[] arr, int target) {

        int pivot = pivotIndex(arr);

        if (target >= arr[0] && target <= arr[pivot]) {
            return binarySearch(arr, target, 0, pivot);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 6, 7, 1, 2, 5 };
        int target = 2;

        int pivot = pivotIndex(arr);
        int index = searchArray(arr, target);

        System.out.println("Pivot Index: " + pivot);
        System.out.println("Target Found At Index: " + index);
    }
}