public class LoanEMIWithTernary {
    public static void main(String[] args) {

        double principal = 7500000;   // 75,00,000
        double annualRate = 19;       // 19%
        int tenureYears = 5;          // 5 years

        double monthlyRate = annualRate / (12 * 100);
        int tenureMonths = tenureYears * 12;

        double emi = (tenureYears > 0) ?
                (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                (Math.pow(1 + monthlyRate, tenureMonths) - 1)
                : 0;

        double totalPayment = emi * tenureMonths;
        double totalInterest = totalPayment - principal;

        System.out.println(
            (emi > 0)
                ? "Loan Amount (Principal): " + principal +
                  "\nTenure (Months): " + tenureMonths +
                  "\nMonthly EMI: " + emi +
                  "\nTotal Interest Payable: " + totalInterest +
                  "\nTotal Amount Payable: " + totalPayment
                : "Invalid Loan Tenure"
        );
    }
}
