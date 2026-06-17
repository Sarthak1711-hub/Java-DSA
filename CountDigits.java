public class CountDigits {

    static void countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int number = 9872;
        countDigits(number);
    }
}