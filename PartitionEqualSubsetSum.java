public class PartitionEqualSubsetSum {

    static boolean partition(int[] arr, int target, int index) {

        if (index == 0 && target == -1) {

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }

            System.out.println("Total Sum: " + sum);

            if (sum % 2 != 0) {
                System.out.println("Partition into two equal subsets is not possible.");
                return false;
            }

            target = sum / 2;

            System.out.println("Target Sum: " + target);
        }

        if (target == 0) {
            return true;
        }

        if (index == arr.length) {
            return false;
        }

        boolean includeVal = partition(arr, target - arr[index], index + 1);

        boolean excludeVal = partition(arr, target, index + 1);

        return includeVal || excludeVal;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 5, 11, 5 };

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean ans = partition(arr, -1, 0);

        if (ans == true) {
            System.out.println("Partition into two equal subsets is possible.");
        } else {
            System.out.println("Partition into two equal subsets is not possible.");
        }
    }
}