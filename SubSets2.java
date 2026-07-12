
import java.util.Arrays;

public class SubSets2 {

    static void solve(int[] arr, int index, int[] subset, int size) {

        // Base Case
        if (index >= arr.length) {
            for (int i = 0; i < size; i++) {
                System.out.print(subset[i]);
            }
            System.out.println();
            return;
        }

        // Include
        subset[size] = arr[index];
        solve(arr, index + 1, subset, size + 1);

        // Check if next element exists and skip consecutive duplicates
         while (index + 1 < arr.length && arr[index] == arr[index + 1]) {
             index++;
         }
         
        // Exclude
        solve(arr, index + 1, subset, size);

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2 };
        Arrays.sort(arr);
        int[] subset = new int[arr.length];

        solve(arr, 0, subset, 0);
    }
}
