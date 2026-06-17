public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 5};
        int[] secondArray = {4, 3, 1, 5};

        System.out.println("Common elements in both arrays:");

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.println(firstArray[i]);
                }
            }
        }
    }
}