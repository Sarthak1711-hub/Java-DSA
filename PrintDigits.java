public class PrintDigits {

    static void printDigits(int number) {
        while (number != 0) {
            int lastDigit = number % 10;
            number /= 10;

            System.out.print(lastDigit + " ");
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        printDigits(number);
    }
}