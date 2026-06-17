public class AlternateExtremeElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 8 };
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            System.out.print(arr[start] + " ");
            System.out.print(arr[end] + " ");
            start++;
            end--;
        }
    }
}
