public class ThreeSum {

    public static void ThreeSumArr() {

        int[] arr = {2, 7, 11, 15};
        int target = 20;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            // int pairTarget = target - arr[i];
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i]+ arr[j] + arr[k] == target) {
                        System.out.println(
                            arr[i] + " " +
                            arr[j] + " " +
                            arr[k]
                        );
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreeSumArr();
    }
}