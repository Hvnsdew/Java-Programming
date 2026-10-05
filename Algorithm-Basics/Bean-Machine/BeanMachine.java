import java.util.Scanner;

/**
 * A Galton Board (Bean Machine) simulation.
 * Demonstrates binomial distribution by dropping balls through a triangular array of pegs.
 * 
 * Programmer: Jiho Shin
 */
public class BeanMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop : ");
        int balls = sc.nextInt();
        System.out.print("Enter the number slots in the bean machine : ");
        int slots = sc.nextInt();
        System.out.println();
        int[] slotCounts = new int[slots];

for (int i = 0; i < balls; i++) {
            int rightFalls = 0;
            for (int j = 0; j < slots - 1; j++) {
                int random = (int) (Math.random() * 2);
                rightFalls += random;
                if (random == 0)
                    System.out.print("L");
                else
                    System.out.print("R");
            }
            slotCounts[rightFalls]++;
            System.out.println();
        }
           sc.close();

        System.out.println("\nHistogram");
        System.out.println("Slot Beans");
        for (int i = 0; i < slots; i++) {
            System.out.printf("%4d  ", i); 
            for (int j = 0; j < slotCounts[i]; j++) {
                System.out.print("O ");
            }
            System.out.println();
        }
    }
}
