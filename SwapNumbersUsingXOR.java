public class SwapNumbersUsingXOR {

    public static void main(String[] args) {

        int firstNumber = 5;
        int secondNumber = 6;

        System.out.println("Initial value of firstNumber = " + firstNumber);
        System.out.println("Initial value of secondNumber = " + secondNumber);

        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;

        System.out.println("After swapping, firstNumber = " + firstNumber);
        System.out.println("After swapping, secondNumber = " + secondNumber);
    }
}