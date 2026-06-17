public class ConvertToUppercase {

    public static void main(String[] args) {

        String text = "hello";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            ch = (char) (ch - 32);

            System.out.print(ch);
        }
    }
}