public class PartitionEqualSubsetSum {

    static boolean solve(int target, int[] arr, int index) {

        if (target == 0) {
            return true;
        }
        if (index == arr.length) {
            return false;
        }

        boolean includeVal = solve(target - arr[index], arr, index + 1);
        boolean excludeVal = solve(target, arr, index + 1);

        return includeVal || excludeVal;

    }

    public static boolean partition(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int target = sum / 2;

        if (sum % 2 != 0) {
            return false;
        }

        boolean ans = solve(target, arr, 0);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 11, 5 };
        partition(arr);
    }
}
