public class PerfectNumber{
     static void checkPerfect(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println("The number is perfect");
        } else {
            System.out.println("The number is not perfect");
        }
    }

    public static void main(String[] args) {
        int number = 12;
        checkPerfect(number);
    }
}