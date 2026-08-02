import java.util.Scanner;

public class QuickSort {

    // Partition Function
    static int partition(int[] arr, int start, int end) {
        int idx = start - 1;
        int pivotVal = arr[end];
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivotVal) {
                idx++;
                swap(arr, idx, j);
            }
        }

        idx++;
        swap(arr, idx, end);
        return idx;
    }

    // Swap Function
    static void swap(int[] arr, int idx, int j) {
        int temp = 0;
        temp = arr[idx];
        arr[idx] = arr[j];
        arr[j] = temp;
    }

    // Quick Sort Function
    static void quickSort(int[] arr, int low, int high) {
        int start = low;
        int end = high;

        if (start >= end) {
            return;
        }
        int pivotIdx = partition(arr, start, end);
        if (start < end) {
            quickSort(arr, start, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, end);
        }
    }

    // Print Array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call Quick Sort
        quickSort(arr, 0, n - 1);

        // Output
        printArray(arr);

        sc.close();
    }
}
