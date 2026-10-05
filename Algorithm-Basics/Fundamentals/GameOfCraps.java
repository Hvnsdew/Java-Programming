/* project4
* Source code: GameOfCraps.java
*/
public class GameOfCraps {
    public static void main(String[] args) {
        int dice1 = getDice();
        int dice2 = getDice();
        int result = dice1 + dice2;
        System.out.println("You rolled: ");
        displayDice(dice1);
        displayDice(dice2);
        System.out.println(dice1 + "+" + dice2 + "=" + result);
        if (result == 2 || result == 3 || result == 12) {
            System.out.println("You lose!");
        } else if (result == 7 || result == 11) {
            System.out.println("You win");
        } else {
            int points = result;
            System.out.println("point is " + points);
            do {
                dice1 = getDice();
                dice2 = getDice();
                result = dice1 + dice2;
                System.out.println("You rolled: ");
                displayDice(dice1);
                displayDice(dice2);
            } while (result != 7 && result != points);
            if (result == 7) {
                System.out.println("You lose");
            } else {
                System.out.println("You win");
            }
        }
    }

    public static int getDice() {
        int ramdomdice = (int) (Math.random() * 6) + 1;
        return ramdomdice;
    }

    public static void displayDice(int dice) {
        String diceTop = "--------- ";
        String middle = "";
        switch (dice) {
            case 1:
                middle = "|       |\n|   *   |\n|       |";
                break;
            case 2:
                middle = "| *     |\n|       |\n|     * |";
                break;
            case 3:
                middle = "| *     |\n|   *   |\n|     * |";
                break;
            case 4:
                middle = "| *   * |\n|       |\n| *   * |";
                break;
            case 5:
                middle = "| *   * |\n|   *   |\n| *   * |";
                break;
            case 6:
                middle = "| *   * |\n| *   * |\n| *   * |";
                break;

        }
        System.out.println(diceTop + "\n" + middle + "\n" + diceTop);
    }
}
