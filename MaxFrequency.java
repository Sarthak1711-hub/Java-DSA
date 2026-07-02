public class MaxFrequency {

    public static void main(String[] args) {
        String str = "Saaarthak";
        int maxVal = 0;
        char maxChar = ' ';
        int[] arr = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch]++;
            if (arr[ch] > maxVal) {
                maxVal = arr[ch];
                maxChar = ch;
            }
        }
        System.out.println("Maximum frequency is of " + maxChar + " is: " + maxVal);
    }
}
