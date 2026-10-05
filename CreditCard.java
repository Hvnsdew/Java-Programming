import java.util.Scanner;

public class CreditCard {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CreditCardInfo i = new CreditCardInfo();

        int select = 0;
        while (select != 6) {
            System.out.print(
                    "\n\n\n\n\n\n\n\n\n\nselect service\n Charge(1)\n CashAdvance(2)\n Payment(3)\n Addiction(4)\n Statistics(5)\n Exit(6)\n : ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    i.Charge();
                    while (select != 0) {
                        System.out.print("\nenter 0 to back\n : ");
                        select = sc.nextInt();
                    }
                    break;

                case 2:
                    i.CashAdvance();
                    while (select != 0) {
                        System.out.print("\nenter 0 to back\n : ");
                        select = sc.nextInt();
                    }
                    break;

                case 3:
                    i.Payment();
                    while (select != 0) {
                        System.out.print("\nenter 0 to back\n : ");
                        select = sc.nextInt();
                    }
                    break;

                case 4:
                    i.Addiction();
                    while (select != 0) {
                        System.out.print("\nenter 0 to back\n : ");
                        select = sc.nextInt();
                    }
                    break;

                case 5:
                    i.Statistics();
                    while (select != 0) {
                        System.out.print("\nenter 0 to back\n : ");
                        select = sc.nextInt();
                    }
                    break;

                case 6:
                    System.exit(0);
                default:
                    break;
            }

        }
    }
}

class CreditCardInfo {
    Scanner sc = new Scanner(System.in);
    private String Name;
    private int AcNum;
    private int DueDate;
    private int RewardPoints;
    private int AcBalence;

    public CreditCardInfo() {
        System.out.print("\nname : ");
        String Name = sc.nextLine();
        this.Name = Name;

        System.out.print("\nAccountNumber : ");
        int AcNum = sc.nextInt();
        this.AcNum = AcNum;

        System.out.print("\nDueDate : ");
        int DueDate = sc.nextInt();
        this.DueDate = DueDate;

        System.out.print("\nRewardPoints : ");
        int RewardPoints = sc.nextInt();
        this.RewardPoints = RewardPoints;

        System.out.print("\nAcBalance : ");
        int AcBalence = sc.nextInt();
        this.AcBalence = AcBalence;
    }

    void Charge() {
        System.out.print("\nEnter the amount : ");
        int amount = sc.nextInt();
        this.AcBalence += amount;
    }

    void CashAdvance() {
        System.out.print("\nEnter the amount : ");
        int cash = sc.nextInt();
        this.AcBalence += cash;

    }

    void Payment() {
        System.out.print("\nEnter the amount : ");
        int payment = sc.nextInt();
        this.AcBalence -= payment;
    }

    void Addiction() {
        System.out.print("\nEnter the interest(%) : ");
        double Interest = sc.nextDouble();
        this.AcBalence += (this.AcBalence * (Interest / 100));
    }

    void Statistics() {
        System.out.println(
                "\n\n\n\n\n\n\n\n\n\nName : " + Name + System.lineSeparator() + "AccountNumber : " + AcNum + "\n"
                        + "DueDate : " + DueDate
                        + "\n" + "RewardPoints : " + RewardPoints + "\n" + "AccountBalance : " + AcBalence);
    }
}