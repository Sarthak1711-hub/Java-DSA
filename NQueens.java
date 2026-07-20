public class NQueens {

    public static boolean isSafe(char[][] board, int rowIndex, int colIndex) {

        int row = rowIndex;
        int col = colIndex;

        while (row >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;

        }

        row = rowIndex;
        col = colIndex;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row = row - 1;
            col = col - 1;

        }

        row = rowIndex;
        col = colIndex;

        while (row >= 0 && col < board.length) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row = row - 1;
            col = col + 1;

        }
        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("Valid Solution: ");
        for (int rowIndex = 0; rowIndex < board.length; rowIndex++) {

            for (int colIndex = 0; colIndex < board[rowIndex].length; colIndex++) {
                System.out.print(board[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void solve(char[][] board, int rowIndex) {

        if (rowIndex == board.length) {
            printBoard(board);
            return;
        }

        for (int colIndex = 0; colIndex < board.length; colIndex++) {

            if (isSafe(board, rowIndex, colIndex)) {

                board[rowIndex][colIndex] = 'Q';
                solve(board, rowIndex + 1);
                board[rowIndex][colIndex] = '.';
            }
        }
    }

    public static void main(String[] args) {

        int n = 4;
        char[][] board = new char[n][n];

        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            for (int colIndex = 0; colIndex < n; colIndex++) {
                board[rowIndex][colIndex] = '.';
            }
        }
        solve(board, 0);
    }
}