
public class Tester {
    public static void main(String[] args) {
        String accountNumber = "1001";
        int salary = 75001;
        int accountBalance = 250000;
        String loanType = "Business";
        int loanAmountExpected = 300000;
        int emisExpected = 30;
        int eligibleLoanAmount = 0;
        int eligibleEmis = 0;

        if (salary > 75000) {
            if (loanType.contains("Business")) {
                eligibleLoanAmount = 7500000;
                eligibleEmis = 84;
            }
        } else if (salary > 50000) {
            if (loanType.contains("House")) {
                eligibleLoanAmount = 6000000;
                eligibleEmis = 60;
            }
        } else if (salary > 25000) {
            if (loanType.contains("Car")) {
                eligibleLoanAmount = 500000;
                eligibleEmis = 36;
            }
        }

        if (!(accountNumber.length() == 4) || !accountNumber.startsWith("1")) {
            System.out.println("The account number should be of 4 digits and its first digit should be 1");
        } else if (!(accountBalance >= 1000)) {
            System.out.println("The customer should have a minimum balance of $1000 in the account");
        } else {
            if (loanAmountExpected < eligibleLoanAmount && emisExpected < eligibleEmis) {
                System.out.println("eligibleLoanAmount = " + eligibleLoanAmount);
                System.out.println("eligibleEmis = " + eligibleEmis);
            }

        }

    }
}
