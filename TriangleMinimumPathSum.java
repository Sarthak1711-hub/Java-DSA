public class TriangleMinimumPathSum {

    static int solve(int[][] arr, int row, int col) {

        // Base Case
        if (row == arr.length - 1) {
            System.out.println("Base Case -> Returning: " + arr[row][col]);
            return arr[row][col];
        }

        int ansLeft = solve(arr, row + 1, col);
        int ansRight = solve(arr, row + 1, col + 1);

        System.out.println("Current Element: " + arr[row][col]);
        System.out.println("Left Returned: " + ansLeft);
        System.out.println("Right Returned: " + ansRight);

        int ans = arr[row][col] + Math.min(ansLeft, ansRight);

        System.out.println("Returning: " + arr[row][col] + " + min(" + ansLeft + ", " + ansRight + ") = " + ans);

        return ans;
    }

    public static void main(String[] args) {

        int[][] arr = {
                { 2, 0, 0, 0 },
                { 3, 4, 0, 0 },
                { 6, 5, 7, 0 },
                { 4, 1, 8, 3 }
        };

        int answer = solve(arr, 0, 0);

        System.out.println(answer);
    }
}