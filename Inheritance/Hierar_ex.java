
class Account {

    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " New balance: " + balance);
    }
}

// Derived Class 1
class SavingAccount extends Account {

    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        // balance= balance - amount //
        System.out.println("Interest added: " + interest + " New balance: " + balance);
    }

}

// Derived Class 2
class CurrentAccount extends Account {

    double overdraftLimit;

    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;

            System.out.println("Withdraw: " + amount + " New balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
        }
    }
}

// Main Class
public class Hierar_ex {

    public static void main(String[] args) {

        // Saving Account
        SavingAccount savingAccount = new SavingAccount();

        savingAccount.accountHolderName = "Payal Badhe";
        savingAccount.balance = 1000;
        savingAccount.interestRate = 5;

        savingAccount.deposit(500);
        savingAccount.applyInterest();
        System.out.println();

        // Current Account
        CurrentAccount current = new CurrentAccount();

        current.accountHolderName = "Bob";
        current.balance = 1000;
        current.overdraftLimit = 500;

        current.deposit(500);
        current.withdraw(2800);
    }

}
