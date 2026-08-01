import java.util.*;

public class CountInversion {

    public static int merge(int[] arr, int start, int mid, int end) {
        int inversion = 0;
        int k = start;
        int leftArrLen = mid - start + 1;
        int rightArrLen = end - mid;

        int[] leftArr = new int[leftArrLen];
        int[] rightArr = new int[rightArrLen];

        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = arr[start + i]; // important
        }
        for (int j = 0; j < rightArrLen; j++) {
            rightArr[j] = arr[mid + 1 + j]; // important
        }

        int i = 0;
        int j = 0;

        while (i < leftArrLen && j < rightArrLen) {
            if (leftArr[i] > rightArr[j]) {
                arr[k] = rightArr[j];
                j++;
                inversion = inversion + leftArrLen - i;
            } else {
                arr[k] = leftArr[i];
                i++;
            }
            k++;
        }

        while (i < leftArrLen) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArrLen) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        return inversion;
    }

    public static int mergeSort(int[] arr, int start, int end) {

        if (start >= end) {
            return 0;
        }
        int totalInversionCount = 0;

        int mid = start + (end - start) / 2;

        int leftInversionCount = mergeSort(arr, start, mid);

        int rightInversionCount = mergeSort(arr, mid + 1, end);

        int mergerInversionCount = merge(arr, start, mid, end);

        totalInversionCount = leftInversionCount + rightInversionCount + mergerInversionCount;

        return totalInversionCount;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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

        int inversionCount = mergeSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        printArray(arr);

        System.out.println("Inversion Count: " + inversionCount);

        sc.close();
    }
}