public class PrimeNumberChecker {

    static void checkPrime(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("The number is not prime");
                return;
            }
        }

        System.out.println("The number is prime");
    }

    public static void main(String[] args) {
        int number = 11;
        checkPrime(number);
    }
}