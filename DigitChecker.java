public class DigitChecker {

    public static void main(String[] args) {

        String str = "123";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}