public class ArrayRecursionOperations {

    // static int sum = 0;

    public static int processArray(int[] myArr, int index) {

        /*
         * Question 1: Print all array elements (Forward)
         *
         * if (index == myArr.length) {
         *     return;
         * }
         *
         * System.out.println(myArr[index]);
         * processArray(myArr, index + 1);
         */

        /*
         * Question 2: Print all array elements (Reverse)
         *
         * if (index == -1) {
         *     return;
         * }
         *
         * System.out.println(myArr[index]);
         * processArray(myArr, index - 1);
         */

        /*
         * Question 3: Find the sum of all array elements
         *
         * if (index == myArr.length) {
         *     return;
         * }
         *
         * sum += myArr[index];
         * processArray(myArr, index + 1);
         */

        /*
         * Question 4: Find the product of all array elements
         */

        // Base Case
        if (index == myArr.length) {
            return 1;
        }

        // Recursive Case
        return myArr[index] * processArray(myArr, index + 1);
    }

    public static void main(String[] args) {

        int[] myArr = {1, 2, 3};

        // Question 1
        // processArray(myArr, 0);

        // Question 2
        // processArray(myArr, myArr.length - 1);

        // Question 3
        // processArray(myArr, 0);
        // System.out.println(sum);

        // Question 4
        int product = processArray(myArr, 0);
        System.out.println(product);
    }
}