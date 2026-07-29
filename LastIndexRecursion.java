public class LastIndexRecursion {

    public static int lastIndex(String str, int i, char ch) {

        if (i == -1) {
            return -1;
        }

        if (ch == str.charAt(i)) {
            return i;
        }
        
        int ans = lastIndex(str, str.length() - 1, ch);
        return ans;
    }

    public static void main(String[] args) {

        String str = "aaba";
        char ch = 'a';

        int ans = lastIndex(str, str.length() - 1, ch);

        System.out.println("The last index of " + ch + " is: " + ans);
    }
}