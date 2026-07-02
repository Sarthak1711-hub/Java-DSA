public class ReverseWords {

    public static String reverseWords(String str) {

        StringBuilder ans = new StringBuilder();

        int i = str.length() - 1;

        while (i >= 0) {

            int j = i;

            // Find the beginning of the current word
            while (j >= 0 && str.charAt(j) != ' ') {
                j--;
            }

            // Append the word
            ans.append(str.substring(j + 1, i + 1));

            if (j > 0) {
                ans.append(" ");
            }

            i = j - 1;
        }

        return ans.toString().trim();
    }

    public static void main(String[] args) {

        String str = "  IAM Maam";

        System.out.println(reverseWords(str));
    }
}