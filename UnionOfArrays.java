public class UnionOfArrays {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {1, 2, 8, 7, 6};

        int[] unionArray = new int[firstArray.length + secondArray.length];
        int size = 0;

        // Copy elements of first array
        for (int i = 0; i < firstArray.length; i++) {
            unionArray[size] = firstArray[i];
            size++;
        }

        // Add only unique elements from second array
        for (int i = 0; i < secondArray.length; i++) {
            int count = 0;

            for (int j = 0; j < size; j++) {
                if (secondArray[i] == unionArray[j]) {
                    count++;
                }
            }

            if (count == 0) {
                unionArray[size] = secondArray[i];
                size++;
            }
        }

        // Print union array
        for (int i = 0; i < size; i++) {
            System.out.print(unionArray[i] + " ");
        }
    }
}