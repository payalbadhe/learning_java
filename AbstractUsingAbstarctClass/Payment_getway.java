// Abstract class defines the contract for all payments

abstract class Payment {

    public abstract void processPayment(double amount);

    public abstract void generateReceipt();
}

// Credit Card Payment Implementation
class CreditCardPayment extends Payment {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of Rs "
                + amount + " using Card Number: " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Payment Receipt Generated.");
    }
}
