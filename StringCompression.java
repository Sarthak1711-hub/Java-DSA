public class StringCompression {
    public static void main(String[] args) {
        String str = "aabbcc";
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                ans.append(str.charAt(i - 1));
                ans.append(count);
                count = 1;
            }

        }
        ans.append(str.charAt(str.length() - 1));
        ans.append(count);
        System.out.println(ans);
        System.out.println(ans.length());
    }
}