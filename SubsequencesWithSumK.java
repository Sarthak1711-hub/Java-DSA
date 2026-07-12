public class SubsequencesWithSumK {
    static boolean solve(int[] arr, int index, int currentSum, int targetSum) {

        if (index == arr.length) {
            if (currentSum == targetSum) {
                return true;
            }
            return false;
        }

        boolean ans1 = solve(arr, index + 1, currentSum + arr[index], targetSum);

        boolean ans2 = solve(arr, index + 1, currentSum, targetSum);

        if (ans1 == true || ans2 == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // int[] arr = { 1, 2, 1 };
        // int targetSum = 2;
        int[] arr = {  5,6,7 };
        int targetSum = 4;
        int index = 0;
        int currentSum = 0;

        boolean finalAns = solve(arr, index, currentSum, targetSum);
        System.out.println(finalAns);
    }
}
