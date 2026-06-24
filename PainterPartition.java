public class PainterPartition {

    static boolean isValidAnswer(int arr[], int painters, int mid) {
        int painterCount = 1;
        int paintedLength = 0;

        for (int i = 0; i < arr.length; i++) {

            if (paintedLength + arr[i] <= mid) {
                paintedLength = paintedLength + arr[i];
            } else {
                painterCount++;

                if (painterCount > painters || arr[i] > mid) {
                    return false;
                }

                paintedLength = arr[i];
            }
        }

        return true;
    }

    public static int painterPartition(int[] arr, int painters) {

        int length = arr.length;
        int sum = 0;
        int ans = -1;

        if (length < painters) {
            return -1;
        }

        int start = 0;

        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
        }

        int end = sum;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValidAnswer(arr, painters, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] boards = {10, 20, 30, 40};
        int painters = 2;

        int result = painterPartition(boards, painters);

        if (result == -1) {
            System.out.println("Partition not possible");
        } else {
            System.out.println("Minimum time required: " + result);
        }
    }
}