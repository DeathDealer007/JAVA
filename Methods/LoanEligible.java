import java.util.*;

class LoanEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = sc.nextInt();

        System.out.print("Enter the loan amount: ");
        int loan = sc.nextInt();

        System.out.print("Enter the credit score: ");
        int credit = sc.nextInt();

        System.out.print("Do you have PAN card? (true/false): ");
        boolean pan = sc.nextBoolean();

        System.out.print("Enter account history in years: ");
        int years = sc.nextInt();

        String res = checker(income, loan, credit);

        if (res.equals("eligible")) {
            loanRating(income, credit, pan, years, loan);
        } else {
            System.out.println("The user is not eligible");
        }
    }

    public static String checker(int income, int loan, int credit) {
        if (income < 10000) {
            return "not eligible";
        } else if (loan > (20 * income)) {
            return "not eligible";
        } else if (credit < 0) {
            return "not eligible";
        } else {
            return "eligible";
        }
    }

    // 🔹 New Method
    public static void loanRating(int income, int credit, boolean pan, int years, int loan) {

        if (!pan || years < 1) {
            System.out.println("PAN or account history not sufficient");
            return;
        }

        String rating;
        int maxLoan;

        if (credit >= 750) {
            rating = "Excellent";
            maxLoan = 25 * income;
        } else if (credit >= 650) {
            rating = "Good";
            maxLoan = 20 * income;
        } else if (credit >= 500) {
            rating = "Average";
            maxLoan = 10 * income;
        } else {
            System.out.println("Poor credit score, loan not approved");
            return;
        }

        System.out.println("Credit Rating: " + rating);

        if (loan <= maxLoan) {
            System.out.println("Loan Approved: " + loan);
        } else {
            System.out.println("Maximum Loan Allowed: " + maxLoan);
        }
    }
}
