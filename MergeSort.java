import java.util.*;

public class MergeSort {

    // Merge Function
    public static void merge(int[] arr, int start, int mid, int end) {

        int leftArrLen = mid - start + 1;
        int rightArrLen = end - mid;

        int[] leftArr = new int[leftArrLen];
        int[] rightArr = new int[rightArrLen];

        // Copy left half
        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = arr[start + i];
        }

        // Copy right half
        for (int j = 0; j < rightArrLen; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;

        // Merge the two sorted arrays
        while (i < leftArrLen && j < rightArrLen) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array
        while (i < leftArrLen) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array
        while (j < rightArrLen) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Merge Sort Function
    public static void mergeSort(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    // Print Array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }
}