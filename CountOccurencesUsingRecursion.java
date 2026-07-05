public class CountOccurencesUsingRecursion {

    static int count = 0;
    
    public static int LinearSearch(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            count = count + 1;
        }

        return LinearSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 7 };
        int target = 7;
        LinearSearch(arr, target, 0);
        System.out.println("The count of the element is: " + count);
    }
}
