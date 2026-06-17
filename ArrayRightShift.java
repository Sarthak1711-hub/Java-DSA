import java.util.Arrays;
public class ArrayRightShift {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int n = arr.length;
        int temp = arr[n - 1];

        // Shift all elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the first position
        arr[0] = temp;

        System.out.println("Array after right shift: " + Arrays.toString(arr));
    }
}