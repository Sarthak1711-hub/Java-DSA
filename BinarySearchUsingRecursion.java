public class BinarySearchUsingRecursion {
    public static int searching(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;

        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        mid = start + (end - start) / 2;
        return searching(arr, target, start, end);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8 };
        int target = 7;
        int start = 0;
        int end = arr.length - 1;
        int indexVal = searching(arr, target, start, end);
        System.out.println("Element found at: " + indexVal + "th index");

    }

}
