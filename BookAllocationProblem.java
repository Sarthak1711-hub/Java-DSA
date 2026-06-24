public class BookAllocationProblem {

    static boolean isValidAnswer(int arr[], int students, int mid) {
        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= mid) {
                pages = pages + arr[i];
            } else {
                studentCount++;

                if (studentCount > students || arr[i] > mid) {
                    return false;
                }

                pages = arr[i];
            }
        }

        return true;
    }

    public static int bookAllocate(int[] arr, int students) {
        int length = arr.length;
        int start = 0;
        int sum = 0;
        int ans = -1;

        if (length < students) {
            return -1;
        }

        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
        }

        int end = sum;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValidAnswer(arr, students, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int students = 2;

        int result = bookAllocate(arr, students);

        if (result == -1) {
            System.out.println("Allocation not possible");
        } else {
            System.out.println("Minimum maximum pages: " + result);
        }
    }
}