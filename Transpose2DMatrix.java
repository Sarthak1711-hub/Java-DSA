public class Transpose2DMatrix {
    public static int[][] Transpose() {
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
        int[][] result = Transpose();
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
