package observer;

import model.Transaction;

public class EmailNotification implements PaymentObserver {
    public void update(Transaction transaction) {
        System.out.println("Email sent for Transaction "
                + transaction.getTransactionId()
                + " Status: " + transaction.getStatus());
    }
}
