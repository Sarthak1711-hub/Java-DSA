public class FindUnsortedElement{
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 7, 9, 8 };
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                System.out.println("The first unsorted element in the array is:- " + arr1[i + 1]);
                return;
            }
        }
    }
}
