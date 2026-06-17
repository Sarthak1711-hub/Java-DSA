public class CountConsonants {

    public static void main(String[] args) {

        String text = "Hello";
        text = text.toLowerCase();

        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch != 'a' && ch != 'e' && ch != 'i'
                        && ch != 'o' && ch != 'u') {

                    consonantCount++;
                }
            }
        }

        System.out.println("Consonants: " + consonantCount);
    }
}