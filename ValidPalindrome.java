import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String str, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (str.charAt(right) != str.charAt(left)) {
            return false;
        } else {
            isPalindrome(str, left + 1, right - 1);
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean ans = isPalindrome(str, 0, str.length() - 1);
        if (ans == true) {
            System.out.println("The string " + str + " is a palindrome");
        } else {
            System.out.println("The string " + str + " is not a palindrome");
        }
        sc.close();
    }
}