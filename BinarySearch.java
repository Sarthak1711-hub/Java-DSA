public class BinarySearch {
    public static int searchArray(int[] arr) {
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        int target = 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
           
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int result = searchArray(arr);
        if (result == -1) {
            System.out.println("Element not found ");
        } else {
            System.out.println("Element found at: " + result + "th index");
        }

    }
}
