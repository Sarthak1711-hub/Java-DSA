import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 7, 11, 15};

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            uniqueNumbers.add(numbers[i]);
        }

        System.out.println("Array after removing duplicates:");

        for (Integer number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}