public class PowerOfTwoUsingRecursion {

    public static int powerOfTwo(int power) {

        if (power == 0) {
            return 1;
        }

        int ans = 2 * powerOfTwo(power - 1);
        return ans;
    }

    public static void main(String[] args) {

        int power = 10;
        int result = powerOfTwo(power);

        System.out.println(result);
    }

}
