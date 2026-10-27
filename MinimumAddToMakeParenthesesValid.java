public class MinimumAddToMakeParenthesesValid {

    public static int minAddToMakeValid(String s) {

        int open = 0;
        int addition = 0;

        char ch[] = s.toCharArray();

        for (int i = 0; i <= ch.length - 1; i++) {
            if (ch[i] == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    addition++;
                }
            }
        }
        int finalAns = open + addition;
        return finalAns;
    }

    public static void main(String[] args) {

        String s = "))((";

        System.out.println(minAddToMakeValid(s));
    }
}