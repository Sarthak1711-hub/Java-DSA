public class PrintingDigitsUsingRecursion {

    public static void printDigits(int value) {

        if (value == 0) {
            return;
        }
        int lastDigit = value % 10;
        value = value / 10;
        printDigits(value);
        System.out.println(lastDigit);
    }

    public static void main(String[] args) {
        int value = 137;
        printDigits(value);
    }
}
