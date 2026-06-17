public class MaximumElement {

    public static void main(String[] args) {

        int[] arr1 = {193, 246, 394, 412, 222, 110};

        int max = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }

        System.out.println("Maximum Element: " + max);
    }
}