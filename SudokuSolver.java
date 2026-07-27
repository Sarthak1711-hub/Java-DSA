public class SudokuSolver {

    static boolean findEmptyCell(char[][] board, int[] emptyCell) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') {
                    emptyCell[0] = i;
                    emptyCell[1] = j;
                    return true;
                }

            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char digit) {
        
        for (int colIndex = 0; colIndex < 9; colIndex++) {
            if (board[row][colIndex] == digit) {
                return false;
            }
        }

        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            if (board[rowIndex][col] == digit) {
                return false;
            }
        }

        // Check 3x3 box
        int startRowIndex = row - row % 3;
        int startColIndex = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int actualRow = startRowIndex + i;
                int actualCol = startColIndex + j;

                if (board[actualRow][actualCol] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean solveSudokuHelper(char[][] board) {

        int[] emptyCell = new int[2];

        // Base Case
        if (!findEmptyCell(board, emptyCell)) {
            return true;
        }

        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];

        // Try digits 1 to 9
        for (int value = 1; value <= 9; value++) {

            char charValue = (char) (value + '0');

            if (isSafe(board, rowIndex, colIndex, charValue)) {

                // Place digit
                board[rowIndex][colIndex] = charValue;

                // Recurse
                if (solveSudokuHelper(board)) {
                    return true;
                }

                // Backtrack
                board[rowIndex][colIndex] = '.';
            }
        }

        return false;
    }

    static void solveSudoku(char[][] board) {
        solveSudokuHelper(board);
    }

    static void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        solveSudoku(board);

        printBoard(board);
    }
}
