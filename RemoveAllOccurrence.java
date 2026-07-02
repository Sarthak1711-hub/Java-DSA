public class RemoveAllOccurrence {

    public static void main(String[] args) {

        String str = "daabcbaabcbc";
        String part = "abc";

        while (str.contains(part)) {
            str = str.replaceFirst(part, "");
        }

        System.out.println(str);
    }
}