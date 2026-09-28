
class Customer {

    int Balance = 10000;

    // creating a withdraw() method which calls the wait() method
    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");

        if (this.Balance < amount) {
            System.out.println("Less balance; waiting for deposit..." + Balance);
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.Balance -= amount;
        System.out.println("withdraw completed..." + Balance);
    }

    // creating a deposit() method with calls the notify() method
    synchronized void deposit(int amount) {
        System.out.println("going to deposit..." + Balance);
        this.Balance += amount;
        System.out.println("deposit completed... " + this.Balance);
        notify(); //to wake only one thread 
    }
}

public class Inter_Thread_ex {

    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
