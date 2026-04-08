class SecureAccount {
    private double balance;

    public SecureAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    public double getBalance() {
        return balance;
    }
}

public class AccountSecureSystem {
    public static void main(String[] args) {
        SecureAccount acc = new SecureAccount(8000);

        acc.deposit(2500);
        acc.withdraw(3000);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}