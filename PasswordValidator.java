import java.util.Scanner;

/* project4
* Source code: PasswordValidator.java
*/
public class PasswordValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a password (or type 'exit' to quit): ");
            String password = input.nextLine();
  
            if (password.equalsIgnoreCase("exit")) {
                System.out.println("Program terminated.");
                break;
            }
            
            if (isValidPassword(password)) {
                System.out.println("Password is valid");
            } else {
                System.out.println("Password is invalid");
            }
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            int quantity = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLetter(password.charAt(i))) {
                    continue;
                } else if (Character.isDigit(password.charAt(i))) {
                    quantity++;
                    continue;

                } else {
                    return false;
                }
            }
                return quantity >= 2;
        }
    }
}
