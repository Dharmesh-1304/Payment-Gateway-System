package observer;

import model.Transaction;

public interface PaymentObserver {
    void update(Transaction transaction);
}
