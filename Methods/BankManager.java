import java.util.*;

class BankManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account holder name: ");
        String name = sc.next();

        System.out.print("Account number: ");
        long acc_num = sc.nextLong();

        System.out.print("IFSC: ");
        String ifsc = sc.next();

        System.out.print("Balance: ");
        int balance = sc.nextInt();

        int choice;

        do {
            System.out.println("\n1: Withdraw\n2: Deposit\n3: Display\n4: Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int wAmount = sc.nextInt();
                    balance = Withdraw(balance, wAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int dAmount = sc.nextInt();
                    balance = Deposit(balance, dAmount);
                    break;

                case 3:
                    Display(name, acc_num, ifsc, balance);
                    break;

                case 4:
                    System.out.println("Thank you! Exit successful.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }

    // Withdraw method
    public static int Withdraw(int balance, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully");
        }
        return balance;
    }

    // Deposit method
    public static int Deposit(int balance, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance = balance + amount;
            System.out.println(amount + " deposited successfully");
        }
        return balance;
    }

    // Display method
    public static void Display(String name, long acc_num, String ifsc, int balance) {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acc_num);
        System.out.println("IFSC: " + ifsc);
        System.out.println("Current Balance: " + balance);
    }
}
