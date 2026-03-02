package access;

public class BackAccount {

    private int balance;

    public BackAccount() {
        balance = 0;
    }

    // public method = deposit
    public void deposit(int amount) {
        if (inAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // public method = withdraw
    public void withdraw(int amount) {
        if(inAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // public method = getBalance
    public int getBalance() {
        return balance;
    }

    private boolean inAmountValid(int amount) {
        return amount > 0;
    }
}
