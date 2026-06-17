public class ArrayFrequencyAnalysis {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int n = arr.length;
        int maxCount = 0;
        int minCount = n;

        int mode = arr[0];
        int leastVal = arr[0];

        for (int i = 0; i <= n - 1; i++) {

            int count = 0;

            for (int j = 0; j <= n - 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }

            if (count < minCount) {
                minCount = count;
                leastVal = arr[i];
            }
        }

        System.out.println("The value with most occurrence is: " + mode);
        System.out.println("The number of occurrences is: " + maxCount);

        System.out.println("The value with least occurrence is: " + leastVal);
        System.out.println("The number of occurrences is: " + minCount);
    }
}