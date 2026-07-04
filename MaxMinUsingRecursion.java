public class MaxMinUsingRecursion {

    public static int findMin(int[] arr, int index, int min) {

        if (index == arr.length - 1) {
            System.out.println("Minimum Element: " + min);
            return arr[index];
        }

        if (min > arr[index]) {
            min = arr[index];
        }

        return findMin(arr, index + 1, min);
    }

    public static int findMax(int[] arr, int index, int max) {

        if (index == arr.length - 1) {
            System.out.println("Maximum Element: " + max);
            return arr[index];
        }

        if (max < arr[index]) {
            max = arr[index];
        }

        return findMax(arr, index + 1, max);
    }

    public static void main(String[] args) {

        int[] arr = { 9, 2, 3, 5, 7 };

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        findMin(arr, 0, min);
        findMax(arr, 0, max);
    }
}