public class RotateMatrix {
    public static int[][] Rotate() {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int totalRows = matrix.length;
        int totalColumns = matrix[0].length;

        int newMatrixTotalRows = matrix.length;
        int newMatrixTotalColumns = matrix[0].length;

        int[][] newMatrix = new int[newMatrixTotalRows][newMatrixTotalColumns];
        
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalColumns; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] result = Rotate();
        for (int i = 0; i < result.length; i++) {
            for (int j = result.length-1; j >= 0; j--) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
