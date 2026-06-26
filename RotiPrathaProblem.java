import java.util.Arrays;

public class RotiPrathaProblem {

    static boolean isValidAnswer(int[] rank, int parathas, int mid) {

        int countOfParathasMade = 0;

        for (int i = 0; i < rank.length; i++) {

            int timeTaken = 0;
            int nextParatha = 1;

            while (timeTaken + (rank[i] * nextParatha) <= mid) {

                timeTaken = timeTaken + (rank[i] * nextParatha);
                countOfParathasMade++;
                nextParatha++;

                if (countOfParathasMade >= parathas) {
                    return true;
                }
            }
        }

        return false;
    }

    static int minimumTime(int[] rank, int parathas) {

        Arrays.sort(rank);

        int start = 0;
        
        int end = rank[0] * (parathas * (parathas + 1)) / 2;

        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValidAnswer(rank, parathas, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] rank = {1, 2, 4, 8, 9};
        int parathas = 3;

        int result = minimumTime(rank, parathas);

        if (result == -1) {
            System.out.println("Not possible.");
        } else {
            System.out.println("Minimum time required = " + result);
        }
    }
}