public class InsertionSort {

    public static void sortArray(int[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 3, 1 };

        sortArray(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}