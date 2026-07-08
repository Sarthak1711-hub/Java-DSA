public class JumpGameUsingRecursion {

    static boolean canReachLastIndex(int[] nums, int currentIndex) {

        // Base Case
        if (currentIndex == nums.length - 1) {
            System.out.println("Reached the last index: " + currentIndex);
            return true;
        }

        if (currentIndex >= nums.length) {
            return false;
        }

        if (nums[currentIndex] == 0) {
            System.out.println("Stuck at index " + currentIndex + " because jump value is 0.");
            return false;
        }

        // Recursive Case
        int maximumJump = nums[currentIndex];
        boolean canReachDestination = false;

        for (int jump = 1; jump <= maximumJump; jump++) {

            System.out.println(
                    "Current Index: " + currentIndex +
                            " | Jump Value: " + maximumJump +
                            " | Trying Jump: " + jump +
                            " | Next Index: " + (currentIndex + jump));

            boolean currentResult = canReachLastIndex(nums, currentIndex + jump);

            canReachDestination = canReachDestination || currentResult;
        }

        return canReachDestination;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 0, 1, 0, 4 };

        boolean result = canReachLastIndex(nums, 0);

        System.out.println("\nCan reach the last index: " + result);
    }
}