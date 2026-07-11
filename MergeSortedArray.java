public class MergeSortedArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int lastidx = m + n - 1;

        while (j >= 0) {

            if (i < 0) {
                nums1[lastidx] = nums2[j];
                j--;
                continue;
            }

            if (nums1[i] <= nums2[j]) {
                nums1[lastidx] = nums2[j];
                j--;

            } else {
                nums1[lastidx] = nums1[i];
                i--;

            }
            lastidx--;
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;

        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
