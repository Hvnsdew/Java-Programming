
/**
 *
 * Programmer: Jiho Shin
 */
public class Power {
    public static double Power1(double x, int n) {
        int res = 1;
        if (n == 0) {
            return res;
        } else {
            for (int i = 1; i <= n; i++) {
                res *= x;
            }
            return res;
        }
    }

    public static double Power2(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * Power2(x, n - 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            double x = Power1(2, i);
            double y = Power2(2, i);
            System.out.println("2.0^" + i + " = " + x + " computed iteratively.");
            System.out.println("2.0^" + i + " = " + y + " computed recursively.");
        }
    }
}
