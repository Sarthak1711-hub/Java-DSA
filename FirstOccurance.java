public class FirstOccurance {

    public static int firstOccurrence(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == 1) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 1, 1, 1, 1 };

        int index = firstOccurrence(arr);

        if (index != -1) {
            System.out.println("First occurrence of 1 is at index: " + index);
        } else {
            System.out.println("1 is not present in the array.");
        }
    }
}
