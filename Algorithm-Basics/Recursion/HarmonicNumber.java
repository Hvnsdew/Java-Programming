import java.util.Scanner;

public class HarmonicNumber {
    public static double harmonicSum(double x) {
        if (x == 1) {
            return 1;
        } else {
            return ((1 / x) + harmonicSum(x - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number and I will determine its harmonic sum : ");
        double x = scanner.nextInt();

        double res = harmonicSum(x);
        System.out.println("The harmonic sum of " + x + " is " + res);
    }
}
