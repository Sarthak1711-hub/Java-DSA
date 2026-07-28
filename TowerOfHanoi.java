public class TowerOfHanoi {

    public static void hanoi(int n, String src, String helper, String destination) {
        if (n == 1) {
            System.out.println(src + " -> " + destination);
            return;
        }
        hanoi(n - 1, src, destination, helper);
        System.out.println(src + " -> " + destination);
        hanoi(n - 1, helper, src, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, "src", "helper", "destination");
    }

}
