public class ArmstrongNumberChecker {

    public static void main(String[] args) {

        int number = 407;
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            int cube = digit * digit * digit;

            sum += cube;

            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }
}