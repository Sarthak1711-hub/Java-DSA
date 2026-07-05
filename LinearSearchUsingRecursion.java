public class LinearSearchUsingRecursion {
   

    public static int LinearSearch(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {

            System.out.println("The element is found at: " + index + "th index");

        }

        return LinearSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 7 };
        int target = 7;

        LinearSearch(arr, target, 0);

    }
}


