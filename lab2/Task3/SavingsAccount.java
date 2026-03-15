package Task3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount -> account number: " + getAccountNumber()
                + ", balance: " + getBalance()
                + ", interest rate: " + interestRate + "%";
    }
}
