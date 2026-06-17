import java.util.Arrays;

public class MultiplyArrayElements {

    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5};
        int[] multipliedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            multipliedArray[i] = originalArray[i] * 10;
        }

        System.out.println(Arrays.toString(multipliedArray));
    }
}