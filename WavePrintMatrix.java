public class WavePrintMatrix {

    static void printWavePattern() {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int totalRows = matrix.length;
        int totalColumns = matrix[0].length;

        for (int columnIndex = 0; columnIndex < totalColumns; columnIndex++) {

            if (columnIndex % 2 == 0) {

                for (int rowIndex = 0; rowIndex < totalRows; rowIndex++) {
                    System.out.println(matrix[rowIndex][columnIndex]);
                }

            } else {

                for (int rowIndex = totalRows - 1; rowIndex >= 0; rowIndex--) {
                    System.out.println(matrix[rowIndex][columnIndex]);
                }
            }
        }
    }

    public static void main(String[] args) {
        printWavePattern();
    }
}