public class PrintNameUsingRecursion {

    public static int printName(int n) {
        if (n == 10) {
            return 10;
        }

        System.out.println("Sarthak");
        int ans  = printName(n + 1);
        return ans;
    }

    public static void main(String[] args) {
        int n = 0;
        int result = printName(n);
        System.out.println(result);
    }
}