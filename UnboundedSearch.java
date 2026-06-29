public class UnboundedSearch {

    public static int binarySearch(int[] arr, int start, int end, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int unboundedSearch(int[] arr, int target) {

        if (arr[0] == target) {
            return 0;
        }

        int start = 0;
        int end = 1;
        int i = 1;
        while (i < arr.length && arr[i] <= target) {

            i = i * 2;

            if (i >= arr.length) {
                i = arr.length - 1;
                break;
            }

            if (arr[i] >= target) {
                start = i / 2;
                end = i;
            }
        }

        return binarySearch(arr, start, end, target);
    }

    public static void main(String[] args) {

        int[] arr = {
                2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
                22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
                42, 44, 46, 48, 50
        };

        int target = 34;

        int index = unboundedSearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }
}
