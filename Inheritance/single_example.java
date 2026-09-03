//base class

class Account {

    String accountHolderName;
    double balance;

    void deposite(double amount) {
        balance += amount;
        System.out.println("Deposited:" + amount + " New balance:" + balance);
    }

}
//derived class

class SavingAccount extends Account {

    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Intrest added:" + interest + " New balance:" + balance);
    }
}

public class single_example {

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.accountHolderName = "Payal badhe";
        savingAccount.balance = 1000.0;
        savingAccount.interestRate = 5.0;
        savingAccount.deposite(500.0);
        savingAccount.applyInterest();

    }
}
