import java.util.Arrays;

public class AggresiveCows {

    static boolean isValidAnswer(int[] stalls, int cows, int mid) {
        int cowsCount = 1;
        int lastPosition = 0;

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - stalls[lastPosition] >= mid) {
                cowsCount++;
                lastPosition = i;

                if (cowsCount == cows) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int aggresiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int start = 0;
        int end = stalls[stalls.length - 1] - stalls[0];
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValidAnswer(stalls, cows, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] stalls = { 1, 2, 4, 8, 9 };
        int cows = 3;

        int result = aggresiveCows(stalls, cows);

        if (result == -1) {
            System.out.println("No valid arrangement possible.");
        } else {
            System.out.println("Maximum minimum distance = " + result);
        }
    }
}