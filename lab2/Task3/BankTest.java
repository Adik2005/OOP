package Task3;

public class BankTest {
    public static void main(String[] args) {
        Account acc1 = new Account(1001);
        SavingsAccount acc2 = new SavingsAccount(1002, 5.0);
        CheckingAccount acc3 = new CheckingAccount(1003);

        acc1.deposit(500);
        acc1.withdraw(100);

        acc2.deposit(1000);
        acc2.addInterest();

        acc3.deposit(200);
        acc3.deposit(100);
        acc3.withdraw(50);
        acc3.deposit(70);
        acc3.deductFee();

        acc1.transfer(200, acc3);

        Bank bank = new Bank();
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        bank.printAccounts();
    }
}