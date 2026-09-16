
interface AccountOpration {

    void deposit(double amount);
}

interface LoanOpration {

    void applyLoan(double amount);
}

class SmartAccount implements AccountOpration, LoanOpration {

    double balance = 5000;
    String accountHolder;

    // public SmartAccount(String accountHolder, double initialBalance) {
    //     this.accountHolder = accountHolder;
    //    this.balance = initialBalance;
    // }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void applyLoan(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Loan approved: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Loan amount must be positive.");
        }
    }
}

public class multiple_ex {

    public static void main(String[] args) {
        SmartAccount account = new SmartAccount();
        account.accountHolder = "John Doe";
        account.balance = 1000;
        account.deposit(1000);
        account.applyLoan(2000);

    }
}
