package observer;

import model.Transaction;

public class SMSNotification implements PaymentObserver {
    public void update(Transaction transaction) {
        System.out.println("SMS sent for Transaction "
                + transaction.getTransactionId()
                + " Status: " + transaction.getStatus());
    }
}
