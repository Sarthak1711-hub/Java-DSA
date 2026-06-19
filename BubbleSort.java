public class BubbleSort {

    public static void sortArray(int[] numbers) {
        int arrayLength = numbers.length;

        for (int pass = 0; pass < arrayLength - 1; pass++) {
            for (int currentIndex = 0; currentIndex < arrayLength - pass - 1; currentIndex++) {

                if (numbers[currentIndex] > numbers[currentIndex + 1]) {

                    int temporaryValue = numbers[currentIndex];
                    numbers[currentIndex] = numbers[currentIndex + 1];
                    numbers[currentIndex + 1] = temporaryValue;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 6, 4, 3, 1 };

        sortArray(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}