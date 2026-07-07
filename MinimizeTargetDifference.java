public class MinimizeTargetDifference {
    static int solve(int[][] mat, int target, int row, int currentSum) {

        // Base Case
        if (row == mat.length) {
            return Math.abs(currentSum - target);
        }

        // Recursive Case
        int minVal = Integer.MAX_VALUE;
        for (int col = 0; col < mat[row].length; col++) {
            int answer = solve(mat, target, row + 1, currentSum + mat[row][col]);

            minVal = Math.min(minVal, answer);
        }

        // Return the minimum difference
        return minVal;

    }

    public static void main(String[] args) {

        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int target = 0;

        int answer = solve(mat, target, 0, 0);

        System.out.println("Minimum Difference: " + answer);
    }
}
