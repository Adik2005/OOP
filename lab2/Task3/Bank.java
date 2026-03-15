package Task3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void printAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }

    public Account findAccount(int accNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accNumber) {
                return account;
            }
        }
        return null;
    }
}