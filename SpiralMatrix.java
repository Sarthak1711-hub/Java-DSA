public class SpiralMatrix {

    public static void SpiralPrint() {

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int totalRows = matrix.length;
        int totalColumns = matrix[0].length;

        int startingRow = 0;
        int endingRow = totalRows - 1;

        int startingColumn = 0;
        int endingColumn = totalColumns - 1;

        while (startingRow <= endingRow && startingColumn <= endingColumn) {

            System.out.println("Top Row -> Left to Right");
            for (int col = startingColumn; col <= endingColumn; col++) {
                System.out.print(matrix[startingRow][col] + " ");
            }
            System.out.println();

            startingRow++;

            System.out.println("Right Column -> Top to Bottom");
            for (int row = startingRow; row <= endingRow; row++) {
                System.out.print(matrix[row][endingColumn] + " ");
            }
            System.out.println();

            endingColumn--;

            System.out.println("Bottom Row -> Right to Left");
            for (int col = endingColumn; col >= startingColumn; col--) {
                System.out.print(matrix[endingRow][col] + " ");
            }
            System.out.println();

            endingRow--;

            System.out.println("Left Column -> Bottom to Top");
            for (int row = endingRow; row >= startingRow; row--) {
                System.out.print(matrix[row][startingColumn] + " ");
            }
            System.out.println();

            startingColumn++;

            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        SpiralPrint();
    }
}