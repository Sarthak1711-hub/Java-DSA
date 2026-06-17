import java.util.Arrays;
public class SwapAltElements {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 7, 9, 8 };
        int temp = 0;
        for (int i = 0; i < arr1.length - 1; i+=2) {
            temp = arr1[i];
            arr1[i] = arr1[i+1];
            arr1[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
