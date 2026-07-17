import java.util.ArrayList;

public class RatInMaze {

    static boolean isSafe(int[][] maze, int row, int col, boolean[][] visited) {

        int n = maze.length;
        // Boundary check
        if (row < 0 || row >= n || col < 0 || col >= n) {
            return false;
        }
        // Blocked cell
        if (maze[row][col] == 0) {
            return false;
        }
        // Already visited
        if (visited[row][col]) {
            return false;
        }
        return true;
    }

    static void solve(int[][] maze, int row, int col, int destRow, int destCol, boolean[][] visited,
            ArrayList<String> paths, String currentPath) {

        // Base Case
        if (row == destRow && col == destCol) {
            paths.add(currentPath);
            return;
        }

        // Mark current cell
        visited[row][col] = true;

        // Down
        int newRow = row + 1;
        int newCol = col;

        if (isSafe(maze, newRow, newCol, visited)) {
            solve(maze, newRow, newCol, destRow, destCol, visited, paths, currentPath + "D");
        }

        // Left
        newRow = row;
        newCol = col - 1;

        if (isSafe(maze, newRow, newCol, visited)) {
            solve(maze, newRow, newCol, destRow, destCol, visited, paths, currentPath + "L");
        }

        // Right
        newRow = row;
        newCol = col + 1;

        if (isSafe(maze, newRow, newCol, visited)) {
            solve(maze, newRow, newCol, destRow, destCol, visited, paths, currentPath + "R");
        }

        // Up
        newRow = row - 1;
        newCol = col;

        if (isSafe(maze, newRow, newCol, visited)) {
            solve(maze, newRow, newCol, destRow, destCol, visited, paths, currentPath + "U");
        }

        // Backtrack
        visited[row][col] = false;
    }

    public static void main(String[] args) {

        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };

        int n = maze.length;

        int startRow = 0;
        int startCol = 0;

        int destRow = n - 1;
        int destCol = n - 1;

        boolean[][] visited = new boolean[n][n];

        ArrayList<String> paths = new ArrayList<>();

        if (maze[startRow][startCol] == 0 || maze[destRow][destCol] == 0) {
            System.out.println(paths);
            return;
        }

        solve(maze, startRow, startCol, destRow, destCol, visited, paths, "");

        System.out.println(paths);
    }
}