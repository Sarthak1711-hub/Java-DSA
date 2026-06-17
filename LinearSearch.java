public class LinearSearch {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int target = 5;

        for (int i = 0; i < numbers.length; i++) {

            if (target == numbers[i]) {
                System.out.println("The value is found at index " + i);
                return;
            }
        }

        System.out.println("The value is not found");
    }
}