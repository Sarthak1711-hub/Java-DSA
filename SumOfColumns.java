public class SumOfColumns {

    static void calculateColumnSums() {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int j = 0; j < columns; j++) {

            int columnSum = 0;

            for (int i = 0; i < rows; i++) {
                columnSum += matrix[i][j];
            }

            System.out.println("Column " + j + " Sum = " + columnSum);
        }
    }

    public static void main(String[] args) {
        calculateColumnSums();
    }
}