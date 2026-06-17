public class ReverseNumber {

    static void reverseNumber(int number) {

        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;

            reversedNumber = reversedNumber * 10 + digit;

            number /= 10;
        }

        System.out.println(reversedNumber);
    }

    public static void main(String[] args) {
        int number = 123;
        reverseNumber(number);
    }
}