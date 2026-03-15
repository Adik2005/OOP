package Task3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        if (sum > 0) {
            transactionCount++;
        }
    }

    @Override
    public void withdraw(double sum) {
        double oldBalance = getBalance();
        super.withdraw(sum);
        if (sum > 0 && sum <= oldBalance) {
            transactionCount++;
        }
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int extraTransactions = transactionCount - FREE_TRANSACTIONS;
            double fee = extraTransactions * 0.02;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    @Override
    public String toString() {
        return "CheckingAccount -> account number: " + getAccountNumber()
                + ", balance: " + getBalance()
                + ", transactions: " + transactionCount;
    }
}