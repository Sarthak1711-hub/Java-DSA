public class StringPermutation {

    static void solve(String input, String output) {

        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            String remaining = input.substring(0, i) + input.substring(i + 1);
            solve(remaining, output + ch);
        }
    }
    public static void main(String[] args) {

        String str = "ABC";

        solve(str, "");
    }
}