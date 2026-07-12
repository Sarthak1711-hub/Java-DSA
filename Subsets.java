public class Subsets {

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

        // Exclude
        solve(arr, index + 1, subset, size);
    }
    public static void main(String[] args) {

        int[] arr = {1,2,2};
        int[] subset = new int[arr.length];

        solve(arr, 0, subset, 0);
    }
}