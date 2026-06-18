public class SumOfRows {

    static void calculateRowSums() {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            int rowSum = 0;

            for (int j = 0; j < columns; j++) {
                rowSum = rowSum + matrix[i][j];
            }
            System.out.println("Row " + i + " Sum = " + rowSum);
        }
    }

    public static void main(String[] args) {
        calculateRowSums();
    }
}