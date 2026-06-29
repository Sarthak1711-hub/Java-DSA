public class MaximumOnes {

    public static int firstOccurrence(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == 1) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 1, 1 },
                { 0, 1, 1, 1 }
        };

        int maxOnes = 0;
        int rowIndex = -1;

        for (int i = 0; i < matrix.length; i++) {

            int index = firstOccurrence(matrix[i]);
            int result;

            if (index == -1) {
                result = 0;
            } else {
                result = matrix[i].length - index;
            }

            if (result > maxOnes) {
                maxOnes = result;
                rowIndex = i;
            }

        }

        System.out.println("Row Index: " + rowIndex);
        System.out.println("Maximum Ones: " + maxOnes);
    }
}