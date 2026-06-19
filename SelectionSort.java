public class SelectionSort {
    public static void sortArray(int[] arr) {
    int length = arr.length;

    for (int pos = 0; pos < length - 1; pos++) {
        
        int minIndex = pos;
        
        for (int index = pos + 1; index < length; index++) {

            if (arr[index] < arr[minIndex]) {
                minIndex = index;
            }
        }
        int temp = arr[pos];
        arr[pos] = arr[minIndex];
        arr[minIndex] = temp;
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