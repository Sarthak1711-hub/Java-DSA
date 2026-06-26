public class SingleNonDuplicate {
    public static int searchNonDuplicate(int[] arr) {
        int length = arr.length;
        int start = 0;
        int end = length - 1;

        if (length == 1) {
            return arr[0];
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == 0 && arr[mid] != arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] == length - 1 && arr[mid] != arr[mid - 2]) {
                return mid;
            }
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return mid;
            }

            if (mid % 2 == 0) {
                if (arr[mid - 1] == arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid - 1] == arr[mid]) {

                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };

        int result = searchNonDuplicate(arr);
        if (result == -1) {
            System.out.println("Element not found ");
        } else {
            System.out.println("Element found at: " + result + "th index");
        }
    }
}
