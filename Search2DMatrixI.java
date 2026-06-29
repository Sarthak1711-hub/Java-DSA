public class Search2DMatrixI {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int start = 0;
        int end = (totalRow * totalCol) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int rowIndex = mid / totalCol;
            int colIndex = mid % totalCol;
            if (matrix[rowIndex][colIndex] == target) {
                return true;
            } else if (matrix[rowIndex][colIndex] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        int target = 3;

        boolean result = searchMatrix(matrix, target);

        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
