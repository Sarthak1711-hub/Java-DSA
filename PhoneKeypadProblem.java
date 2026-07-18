public class PhoneKeypadProblem {

    public static void solve(String digits, int digitIndex, String[] keypad, StringBuilder path) {

        if (digitIndex == digits.length()) {
            System.out.println(path.toString());
            return;
        }

        int digit = digits.charAt(digitIndex) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));

            solve(digits, digitIndex + 1, keypad, path);

            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {

        String[] keypad = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        solve("23", 0, keypad, new StringBuilder());
    }
}