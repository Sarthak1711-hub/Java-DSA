public class NumberOfOccurrences {

    public static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

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

    public static int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

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

    public static int countOccurrences(int[] arr, int target) {
        int lowerBoundIndex = lowerBound(arr, target);
        int upperBoundIndex = upperBound(arr, target);
        return upperBoundIndex - lowerBoundIndex;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 10, 10, 10, 10, 15, 20 };
        int target = 10;

        int lowerBoundIndex = lowerBound(arr, target);
        int upperBoundIndex = upperBound(arr, target);
        int totalOccurrences = countOccurrences(arr, target);

        System.out.println("Lower Bound Index : " + lowerBoundIndex);
        System.out.println("Upper Bound Index : " + upperBoundIndex);
        System.out.println("Number of Occurrences : " + totalOccurrences);
    }
}