public class UniqueElements {
      public static void main(String[] args) {
        int[] numbers = {100, 20, 30, 20, 30};
        int uniqueElement = 0;

        for (int i = 0; i < numbers.length; i++) {
            uniqueElement = numbers[i] ^ uniqueElement;
        }

        System.out.println("Unique element: " + uniqueElement);
    }
}