import java.util.*;

public class DecodeString {

    static String decodeString(String s) {

        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();

        int number = 0;

        StringBuilder current = new StringBuilder();

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {


            // Case 1: If character is a digit then we will convert the character number into integer number using the formula number = number * 10 + (ch[i] - '0');
            // Character.isDigit() is a built-in Java method that checks whether a character is a digit or not.
            
            if (Character.isDigit(ch[i])) {
                number = number * 10 + (ch[i] - '0');

            } 
            
             // Case 2: If character is a [ then we will push the number into countStack and current into stringStack and re-initialize the number to 0 and current to empty string

            else if (ch[i] == '[') {
                countStack.push(number);
                stringStack.push(current);
                number = 0;
                current = new StringBuilder();

            } 

            // Case 3: If character is a ] then we will append current to stringStack top string that is previous and multiply the resultant string till repeatCount

            else if (ch[i] == ']') {
                int repeatCount = countStack.peek();
                countStack.pop();
                StringBuilder previous = stringStack.peek();
                stringStack.pop();

                for (int j = 0; j < repeatCount; j++) {
                    previous.append(current);

                }
                
                // Important 
                current = previous;

            } 
            
            // Case 4: If character is an alphabet then we will append the character to the current string

            else {
                current.append(ch[i]);
            }

        }

        return current.toString();
    }

    public static void main(String[] args) {

        String s1 = "3[a2[c]]";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + decodeString(s1));

        String s2 = "2[abc]3[cd]ef";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + decodeString(s2));

        String s3 = "3[a]";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + decodeString(s3));
    }
}
