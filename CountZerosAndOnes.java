public class CountZerosAndOnes {

    public static void main(String[] args) {

        int[] arr1 = {1, 0, 1};

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        System.out.println("The count of 0 is: " + count0);
        System.out.println("The count of 1 is: " + count1);
    }
}