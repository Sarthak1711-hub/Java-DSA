public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "aabbccd";
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (ans.length() == 0) {
                ans.append(str.charAt(i));
            } else {
                if (str.charAt(i) == ans.charAt(ans.length() - 1)) {
                    ans.deleteCharAt(ans.length() - 1);
                } else {
                    ans.append(str.charAt(i));
                }
            }
        }
        System.out.println(ans);
    }
}
